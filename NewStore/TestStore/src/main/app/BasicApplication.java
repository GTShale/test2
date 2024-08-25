package src.main.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		int t =5;
		
		SpringApplication.run(BasicApplication.class, args);
	}
}