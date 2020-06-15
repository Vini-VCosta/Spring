package costa.vinicius.calculadoraSpring;

import costa.vinicius.calculadoraSpring.model.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(CalculadoraSpringApplication.class, args);

		System.out.println(new Calculator(2,5));
	}

}
