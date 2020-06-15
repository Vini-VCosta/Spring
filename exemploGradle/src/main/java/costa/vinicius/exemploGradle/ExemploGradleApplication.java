package costa.vinicius.exemploGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploGradleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExemploGradleApplication.class, args);

		System.out.println("\nOla! Primeiro teste com Spring (Gradle) ");
	}

}
