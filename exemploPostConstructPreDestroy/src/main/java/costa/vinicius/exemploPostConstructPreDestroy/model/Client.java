package costa.vinicius.exemploPostConstructPreDestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 23:58
 * @version 1.0
 */

//Lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//SpringBoot
@Component
public class Client {

    private String name;
    private String lastname;

    public Client() {
        System.out.println("Classe Cliente!");
    }
}
