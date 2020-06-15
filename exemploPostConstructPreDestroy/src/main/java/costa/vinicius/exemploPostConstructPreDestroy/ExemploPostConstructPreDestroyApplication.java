package costa.vinicius.exemploPostConstructPreDestroy;

import costa.vinicius.exemploPostConstructPreDestroy.dao.ClientDAO;
import costa.vinicius.exemploPostConstructPreDestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploPostConstructPreDestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Vinicius","Costa"));

		System.out.println("ClienteDAo: "+ clientDAO);
		System.out.println("Cliente: "+clientDAO.getClient().toString());
	}

}
