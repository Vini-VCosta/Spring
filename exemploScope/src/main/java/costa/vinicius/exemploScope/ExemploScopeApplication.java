package costa.vinicius.exemploScope;

import costa.vinicius.exemploScope.dao.ClassDAO;
import costa.vinicius.exemploScope.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploScopeApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploScopeApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);

		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto da Classe JDBC: "+objJDBC);
		System.out.println("Objeto da Classe JDBC1: "+objJDBC1);

		System.out.println("Objeto da classe DAO: "+objDAO);
		System.out.println("Objeto da classe DAO1: "+objDAO1);
	}

}
