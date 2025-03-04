package examples.AllCodeSnippets; 
public class class_285{ 
 public static void main() { 
/**
 * An {@link javax.net.ssl.SSLSocket} that doesn't allow {@code SSLv3} only connections
 * <p>fixes https://github.com/koush/ion/issues/386</p>
 */
private static class NoSSLv3SSLSocket extends DelegateSSLSocket {

private NoSSLv3SSLSocket(SSLSocket delegate) {
    super(delegate);

    String canonicalName = delegate.getClass().getCanonicalName();
    if (!canonicalName.equals("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl")){
        // try replicate the code from HttpConnection.setupSecureSocket()
        try {
            Method msetUseSessionTickets = delegate.getClass().getMethod("setUseSessionTickets", boolean.class);
            if (null != msetUseSessionTickets) {
                msetUseSessionTickets.invoke(delegate, true);
            }
        } catch (NoSuchMethodException ignored) {
        } catch (InvocationTargetException ignored) {
        } catch (IllegalAccessException ignored) {
        }
    }
}

@Override
public void setEnabledProtocols(String[] protocols) {
    if (protocols != null && protocols.length == 1 && "SSLv3".equals(protocols[0])) {
        // no way jose
        // see issue https://code.google.com/p/android/issues/detail?id=78187
        List<String> enabledProtocols = new ArrayList<String>(Arrays.asList(delegate.getEnabledProtocols()));
        if (enabledProtocols.size() > 1) {
            enabledProtocols.remove("SSLv3");
        } else {
            LogManager.getLogger().w("SSL stuck with protocol available for " + String.valueOf(enabledProtocols));
        }
        protocols = enabledProtocols.toArray(new String[enabledProtocols.size()]);
    }
    super.setEnabledProtocols(protocols);
}
}


/**
 * {@link javax.net.ssl.SSLSocketFactory} that doesn't allow {@code SSLv3} only connections
 */
private static class NoSSLv3Factory extends SSLSocketFactory {
private final SSLSocketFactory delegate;

private NoSSLv3Factory() {
    this.delegate = HttpsURLConnection.getDefaultSSLSocketFactory();
}

@Override
public String[] getDefaultCipherSuites() {
    return delegate.getDefaultCipherSuites();
}

@Override
public String[] getSupportedCipherSuites() {
    return delegate.getSupportedCipherSuites();
}

private static Socket makeSocketSafe(Socket socket) {
    if (socket instanceof SSLSocket) {
        socket = new NoSSLv3SSLSocket((SSLSocket) socket);
    }
    return socket;
}

@Override
public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
    return makeSocketSafe(delegate.createSocket(s, host, port, autoClose));
}

@Override
public Socket createSocket(String host, int port) throws IOException {
    return makeSocketSafe(delegate.createSocket(host, port));
}

@Override
public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException {
    return makeSocketSafe(delegate.createSocket(host, port, localHost, localPort));
}

@Override
public Socket createSocket(InetAddress host, int port) throws IOException {
    return makeSocketSafe(delegate.createSocket(host, port));
}

@Override
public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
    return makeSocketSafe(delegate.createSocket(address, port, localAddress, localPort));
}
}

static {
HttpsURLConnection.setDefaultSSLSocketFactory(new NoSSLv3Factory());
}
  }
}
