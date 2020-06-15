package costa.vinicius.exemploPostConstructPreDestroy.dao;

import costa.vinicius.exemploPostConstructPreDestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Vinicius Costa
 * @since 11/06/2020 - 00:01
 * @version 1.0
 */
//Lombok
@Getter @Setter
//Spring
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstrusct(){
        System.out.println("Objeto criado!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Objeto finalizado");
    }

}
