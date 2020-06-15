package costa.vinicius.exemploInjecaoDeDependencia;

import costa.vinicius.exemploInjecaoDeDependencia.Interfaces.AnimalInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 19-00
 * @version 1.0
 */
@SpringBootApplication
public class ExemploInjecaoDeDependenciaApplication {

	public static void main(String[] args) {

//		3 maneira - melhor maneira até agora
		ApplicationContext applicationContext = SpringApplication.run(ExemploInjecaoDeDependenciaApplication.class, args);
		Pet pet = applicationContext.getBean(Pet.class);

//		1 maneira - acoplado, errado!
//		Pet pet = new Pet();
//		pet.execute();

//		2 maneira  menos acoplado!
//		Pet pet = new Pet(new Cat);
//		pet.execute();

//		Pet pet1 = new Pet(new Dog);
//		pet1.execute();
	}

}
