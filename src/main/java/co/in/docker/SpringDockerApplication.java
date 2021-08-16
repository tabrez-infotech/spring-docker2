package co.in.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Spring Docker Application!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerEmail() {
//		mailService.sendEmail("tabrez.khan@mind-infotech.com", "Test Mail!!");
//	}
}
