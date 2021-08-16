package co.in.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class DMailboxServiceImpl {
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String mailTo, String mailBody) {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(mailTo);
		// msg.setFrom("spring.email.client1@gmail.com");
		msg.setSubject("Test mail from AWS");
		msg.setText(mailBody);

		javaMailSender.send(msg);

	}
}
