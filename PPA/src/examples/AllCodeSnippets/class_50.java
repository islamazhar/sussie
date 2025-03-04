package examples.AllCodeSnippets; 
public class class_50 {
private String mailhost = "smtp.gmail.com";
private String user;
private String password;
private Session session;
private Multipart _multipart;
public BodyPart messageBodyPart;
DataSource source;
static {
    Security.addProvider(new com.PackageName.JSSEProvider());
}

public MailSender(String user, String password) {
    this.user = user;
    this.password = password;

    Properties props = new Properties();
    props.setProperty("mail.transport.protocol", "smtp");
    props.setProperty("mail.smtp.host", mailhost);
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.socketFactory.fallback", "false");
    props.setProperty("mail.smtp.quitwait", "false");
    _multipart = new MimeMultipart();
    session = Session.getInstance(props, new MailAuthenticator(user,
            password));

}

public synchronized void sendMail(final String subject, final String uuid,
        final String address, final double latitude,
        final double longitude, final String recipients,
        final String filepath, final Context context, final int i, final int j)
        throws Exception {

    Thread thread = new Thread() {
        public void run() {
            Looper.prepare();
            try {
                System.out.println("SENDING       MAIL");
                Message message = new MimeMessage(session);
                messageBodyPart = new MimeBodyPart();
                DatabaseAdapter db = new DatabaseAdapter(context);
                String eId = db.getYourId();
                message.setFrom(new InternetAddress(eId));
                message.setSubject(subject);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String currentDate = sdf.format(new Date());
                SimpleDateFormat sTf = new SimpleDateFormat("hh:mm:ss");
                String currentTime = sTf.format(new Date());
                System.out.println(i);
                messageBodyPart
                        .setText("Someone tried to unlock your device(ID : "+uuid+" ) at: "
                                + currentTime + " on " + currentDate + "\n"
                                + "Device Location : " + address + "\n"
                                + "Map: " + "http://maps.google.com/?q="
                                + latitude + "," + longitude);
                if (recipients.indexOf(',') > 0)
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(recipients));
                else
                    message.setRecipient(Message.RecipientType.TO,
                            new InternetAddress(recipients));

                Transport transport = session.getTransport("smtp");
                System.out.println("CONECTING.....");
                transport.connect(mailhost, user, password);
                message.saveChanges();
                message.setContent(_multipart);
                _multipart.addBodyPart(messageBodyPart);
                message.setContent(_multipart);
                if (source != null) {

                    message.setFileName("image");
                }
                Transport.send(message);
                System.out.println("Mail  sent ...");

                }

                transport.close();


            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    };
    thread.start();

}

public void addAttachment(String filename) throws Exception {
    if (!filename.equals(")) {
        System.out.println("Ataching     file        :)");
        messageBodyPart = new MimeBodyPart();
        source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        _multipart.addBodyPart(messageBodyPart);
        System.out.println("FILE    ATTACHED        :)");
    }
}


class MailAuthenticator extends Authenticator {
    String us;
    String pw;

    public MailAuthenticator(String username, String password) {
        super();
        this.us = username;
        this.pw = password;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(us, pw);
    }
}
