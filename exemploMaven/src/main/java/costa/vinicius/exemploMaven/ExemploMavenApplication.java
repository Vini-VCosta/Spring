package costa.vinicius.exemploMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploMavenApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExemploMavenApplication.class, args);

		System.out.println("\nOla, primeiro teste com Spring (Maven)");
	}



}
