package co.in.docker;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl {

	// static String fromAddres = "spring.email.client1@gmail.com";
	// static String fromAddres = "tabrez.infotech@gmail.com";
	static String fromAddres = "tabrez.khan@mind-infotech.com";
	// static String toAddres = "tabrez.khan@mind-infotech.com";

	// final static String EmailUser = "spring.email.client1@gmail.com";
	// final static String EmailPassword = "tzjduzxbuitlibrj";

	final static String EmailUser = "tabrezkhan";
	final static String EmailPassword = "";

	public void sendMail(String toAddres, String msgBody) {

		try {

			Properties props = new Properties();
			props.put("mail.smtp.host", "SMTP.INTERNAL.MIND-INFOTECH.COM");
			props.put("mail.smtp.port", "25");
			props.put("mail.smtp.ssl.trust", "SMTP.INTERNAL.MIND-INFOTECH.COM");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.connectiontimeout", "10000");
			props.put("mail.smtp.user", "tabrezkhan");

			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(EmailUser, EmailPassword);
				}
			});

			session.setDebug(true);

			InternetAddress fromAddress = new InternetAddress(fromAddres, "Tabrez Khan");
			InternetAddress toAddress = new InternetAddress(toAddres, "Tabrez Khan");
			String msgSubject = "Test Mail!!";
			// String msgBody = "This email send from a AWS";

			Message msg = new MimeMessage(session);
			msg.setFrom(fromAddress);
			msg.addRecipient(Message.RecipientType.TO, toAddress);
			msg.setSubject(msgSubject);
			msg.setText(msgBody);

			Transport transport = session.getTransport("smtp");
			transport.connect();
			transport.sendMessage(msg, msg.getAllRecipients());

		} catch (MessagingException e) {
			System.out.println(e.getMessage() + e.getStackTrace());
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		}
	}
}
