package costa.vinicius.exemploHelloWordCliente;

import costa.vinicius.exemploHelloWordCliente.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExemploHelloWordClienteApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExemploHelloWordClienteApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String name = scanner.next();
		System.out.println("Digite seu sobrenome: ");
		String lastname = scanner.next();
		System.out.println("Digite seu salario: ");
		double income = scanner.nextDouble();
		Client client = new Client(name,lastname,income);
		System.out.println(client);


	}

}
