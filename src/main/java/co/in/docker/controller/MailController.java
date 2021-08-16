package co.in.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.in.docker.DMailboxServiceImpl;
import co.in.docker.Office365MailServiceImp;
import co.in.docker.SendMailServiceImpl;

@RestController
public class MailController {

	@Autowired
	private DMailboxServiceImpl mailService;

	@Autowired
	private SendMailServiceImpl sendMailService;

	@Autowired
	private Office365MailServiceImp office365MailServiceImp;

	@GetMapping("/sendmail/{mailTo}/{mailBody}")
	public String sendmail(@PathVariable String mailTo, @PathVariable String mailBody) {
		mailService.sendEmail(mailTo, mailBody);

		return "Mail successfully send!!";
	}

	@GetMapping("/send-mail/{mailTo}/{mailBody}")
	public String sendMail(@PathVariable String mailTo, @PathVariable String mailBody) {
		sendMailService.sendMail(mailTo, mailBody);

		return "Mail successfully send!!";
	}

	@GetMapping("/send-mail365/{mailTo}/{mailBody}")
	public String sendMail365(@PathVariable String mailTo, @PathVariable String mailBody) {
		office365MailServiceImp.sendEmail(mailTo, mailBody);

		return "Mail successfully send!!";
	}
}
