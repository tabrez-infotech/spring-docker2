package co.in.docker;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class Office365MailServiceImp {
	private static final Logger LOGGER = Logger.getAnonymousLogger();

	private static final String SMTP_HOST = "smtp.office365.com";
	private static final int PORT = 587;
	private static final String ADMIN_ACCOUNT = "tabrez.khan@mind-infotech.com";
	private static final String ADMIN_ACCOUNT_PASS = "NOIDa@1234";

	private final String from = "tabrez.khan@mind-infotech.com";
	// private final String to = "tabrez.khan@mind-infotech.com";

	private final String subject = "Test Mail";
	// private final String messageContent = "Test Message!!";

	public void sendEmail() {
		String to = "tabrez.khan@mind-infotech.com";
		String messageContent = "Test Message!!";
		sendEmail(to, messageContent);
	}

	public void sendEmail(String to, String messageContent) {
		final Session session = Session.getInstance(getEmailProperties(), new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(ADMIN_ACCOUNT, ADMIN_ACCOUNT_PASS);
			}

		});

		try {
			final Message message = new MimeMessage(session);
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setFrom(new InternetAddress(from));
			message.setSubject(subject);
			message.setText(messageContent);
			message.setSentDate(new Date());
			Transport.send(message);
			System.out.println("Message Successfully Sent!");
		} catch (final MessagingException ex) {
			LOGGER.log(Level.WARNING, "Error in sending mail: " + ex.getMessage(), ex);
		}
	}

	public Properties getEmailProperties() {
		final Properties config = new Properties();
		config.put("mail.smtp.auth", "true");
		config.put("mail.smtp.starttls.enable", "true");
		config.put("mail.smtp.host", SMTP_HOST);
		config.put("mail.smtp.port", PORT);
		return config;
	}

	public static void main(final String[] args) {
		new Office365MailServiceImp().sendEmail();

	}

}
