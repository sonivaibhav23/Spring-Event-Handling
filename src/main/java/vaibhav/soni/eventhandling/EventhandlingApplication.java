package vaibhav.soni.eventhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class EventhandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventhandlingApplication.class, args);
	}

}
