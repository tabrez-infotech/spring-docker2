package co.in.docker;

import java.util.StringTokenizer;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@Component
public class MailboxServiceImpl {

	@Autowired
	private JavaMailSenderImpl mailSender = null;

	void setup() {
		mailSender.setHost("SMTP.INTERNAL.MIND-INFOTECH.COM");
		mailSender.setPort(25);
		mailSender.setUsername("");
		mailSender.setPassword("");

	}

	/**
	 * Send mail.
	 *
	 * @param mailbox Mailbox
	 */
	public void send(Mailbox mailbox) {
		setup();
		// mailbox.setMailBody((mailbox.getMailBody(), mailbox.getCreatedDate(),
		// String.valueOf(mailbox.getMessageId()),
		// String.valueOf(mailbox.getMailId())));

		mailbox.setMailBody("Test mail!!");
		// Message preparator for sending mail.
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {

				// Set mail subject
				mimeMessage.setSubject(mailbox.getMailSubject());

				// Set mailFrom
				mimeMessage.setFrom(new InternetAddress(mailbox.getMailFrom()));

				if (!StringUtils.equals(mailbox.getMailTo(), "NA")) {
					StringTokenizer tokenizer = new StringTokenizer(mailbox.getMailTo(), ";");
					while (tokenizer.hasMoreTokens()) {
						mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(tokenizer.nextToken()));
					}
				}

				if (!StringUtils.equals(mailbox.getMailCc(), "NA")) {
					StringTokenizer tokenizer = new StringTokenizer(mailbox.getMailCc(), ";");
					while (tokenizer.hasMoreTokens()) {
						mimeMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(tokenizer.nextToken()));
					}
				}
				// MimeMessageHelper helper= new MimeMessageHelper(mimeMessage, Boolean.TRUE,
				// "UTF-8");
				// helper.setText(mailbox.getMailBody(), Boolean.TRUE);
				//
				// helper.addAttachment("cutie.png", new ClassPathResource("linux-icon.png"));
				//

				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, Boolean.TRUE, "UTF-8");
				helper.setText(mailbox.getMailBody(), Boolean.TRUE);

			}
		};

		// Send mail

		mailSender.send(preparator);

	}
}
