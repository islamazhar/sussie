package examples.AllCodeSnippets; 
public class class_1072 extends javax.mail.Authenticator 
{   
    private String mailhost = "smtp.gmail.com";   
    private String user;   
    private String password;   
    private Session session;   
    private Multipart _multipart;

    static 
    {   
        Security.addProvider(new JSSEProvider());   
    }  

    public GMailSender(String user, String password) 
    {   
        this.user = user;   
        this.password = password;   

        Properties props = new Properties();   
        props.setProperty("mail.transport.protocol", "smtp");   
        props.setProperty("mail.host", mailhost);   
        props.put("mail.smtp.auth", "true");   
        props.put("mail.smtp.port", "465");   
        props.put("mail.smtp.socketFactory.port", "465");   
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");   
        props.put("mail.smtp.socketFactory.fallback", "false");   
        props.setProperty("mail.smtp.quitwait", "false");   

        session = Session.getDefaultInstance(props, this);
        _multipart = new MimeMultipart();
    }   

    protected PasswordAuthentication getPasswordAuthentication() 
    {   
        return new PasswordAuthentication(user, password);   
    }   

    public synchronized void sendMail(String subject, String body, String sender, String recipients) throws Exception 
    {   
        MimeMessage message = new MimeMessage(session);   
        DataHandler handler = new DataHandler(new ByteArrayDataSource(body.getBytes(), "text/plain"));   
        message.setSender(new InternetAddress(sender));   
        message.setSubject(subject);   

        message.setDataHandler(handler);   
        message.setContent(_multipart);
        if (recipients.indexOf(',') > 0)   
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));   
        else  
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipients));   
        Transport.send(message);   

    }   

    public void addAttachment(String filename) throws Exception 
    {
        BodyPart messageBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);

        _multipart.addBodyPart(messageBodyPart);
    }

    public class class_1072 implements DataSource 
    {   
        private byte[] data;   
        private String type;   

        public ByteArrayDataSource(byte[] data, String type) 
        {   
            super();   
            this.data = data;   
            this.type = type;   
        }   

        public ByteArrayDataSource(byte[] data) 
        {   
            super();   
            this.data = data;   
        }   

        public void setType(String type) 
        {   
            this.type = type;   
        }   

        public String getContentType() 
        {   
            if (type == null)   
                return "application/octet-stream";   
            else  
                return type;   
        }   

        public InputStream getInputStream() throws IOException 
        {   
            return new ByteArrayInputStream(data);   
        }   

        public String getName() 
        {   
            return "ByteArrayDataSource";   
        }   

        public OutputStream getOutputStream() throws IOException 
        {   
            throw new IOException("Not Supported");   
        }   
    }   
}
