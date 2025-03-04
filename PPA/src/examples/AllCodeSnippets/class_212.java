package examples.AllCodeSnippets; 
/**
 * Implements the Segmented Integer Counter (SIC) mode on top of a simple
 * block cipher. This mode is also known as CTR mode. This CTR mode
 * was altered to comply with the ZIP little endian counter and
 * different starting point.
 */
public class class_212
    extends StreamBlockCipher
    implements SkippingStreamCipher
{
    private final BlockCipher     cipher;
    private final int             blockSize;

    private byte[]          IV;
    private byte[]          counter;
    private byte[]          counterOut;
    private int             byteCount;

    /**
     * Basic constructor.
     *
     * @param c the block cipher to be used.
     */
    public SICZIPBlockCipher(BlockCipher c)
    {
        super(c);

        this.cipher = c;
        this.blockSize = cipher.getBlockSize();
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    public void init(
        boolean             forEncryption, //ignored by this CTR mode
        CipherParameters    params)
        throws IllegalArgumentException
    {
        if (params instanceof ParametersWithIV)
        {
            ParametersWithIV ivParam = (ParametersWithIV)params;
            byte[] iv = ivParam.getIV();
            System.arraycopy(iv, 0, IV, 0, IV.length);

            // if null it's an IV changed only.
            if (ivParam.getParameters() != null)
            {
                cipher.init(true, ivParam.getParameters());
            }

            reset();
        }
        else
        {
            throw new IllegalArgumentException("SICZIP mode requires ParametersWithIV");
        }
    }

    public String getAlgorithmName()
    {
        return cipher.getAlgorithmName() + "/SICZIP";
    }

    public int getBlockSize()
    {
        return cipher.getBlockSize();
    }

    public int processBlock(byte[] in, int inOff, byte[] out, int outOff)
          throws DataLengthException, IllegalStateException
    {
        processBytes(in, inOff, blockSize, out, outOff);

        return blockSize;
    }

    protected byte calculateByte(byte in)
          throws DataLengthException, IllegalStateException
    {
        if (byteCount == 0)
        {
            cipher.processBlock(counter, 0, counterOut, 0);

            return (byte)(counterOut[byteCount++] ^ in);
        }

        byte rv = (byte)(counterOut[byteCount++] ^ in);

        if (byteCount == counter.length)
        {
            byteCount = 0;

            incrementCounter();
        }

        return rv;
    }

    private void incrementCounter()
    {
        // increment counter by 1.
        for (int i = 0; i < counter.length && ++counter[i] == 0; i++)
        {
            ; // do nothing - pre-increment and test for 0 in counter does the job.
        }
    }

    private void decrementCounter()
    {
        // TODO test - owlstead too lazy to test

        if (counter[counter.length - 1] == 0)
        {
            boolean nonZero = false;

            for (int i = 0; i < counter.length; i++)
            {
                if (counter[i] != 0)
                {
                    nonZero = true;
                }
            }

            if (!nonZero)
            {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
        }

        // decrement counter by 1.
        for (int i = 0; i < counter.length && --counter[i] == -1; i++)
        {
            ;
        }
    }

    private void adjustCounter(long n)
    {
        if (n >= 0)
        {
            long numBlocks = (n + byteCount) / blockSize;

            for (long i = 0; i != numBlocks; i++)
            {
                incrementCounter();
            }

            byteCount = (int)((n + byteCount) - (blockSize * numBlocks));
        }
        else
        {
            long numBlocks = (-n - byteCount) / blockSize;

            for (long i = 0; i != numBlocks; i++)
            {
                decrementCounter();
            }

            int gap = (int)(byteCount + n + (blockSize * numBlocks));

            if (gap >= 0)
            {
                byteCount = 0;
            }
            else
            {
                decrementCounter();
                byteCount =  blockSize + gap;
            }
        }
    }

    public void reset()
    {
        System.arraycopy(IV, 0, counter, 0, counter.length);
        cipher.reset();
        this.byteCount = 0;
    }

    public long skip(long numberOfBytes)
    {
        adjustCounter(numberOfBytes);

        cipher.processBlock(counter, 0, counterOut, 0);

        return numberOfBytes;
    }

    public long seekTo(long position)
    {
        reset();

        return skip(position);
    }

    public long getPosition()
    {
        byte[] res = new byte[IV.length];

        System.arraycopy(counter, 0, res, 0, res.length);

        for (int i = 0; i < res.length; i++)
        {
            int v = (res[i] - IV[i]);

            if (v < 0)
            {
               res[i + 1]--;
               v += 256;
            }

            res[i] = (byte)v;
        }

        // TODO still broken - owlstead too lazy to fix for zip
        return Pack.bigEndianToLong(res, res.length - 8) * blockSize + byteCount;
    }
}
