package costa.vinicius.exemploHelloWorldLombok.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 18:17
 * @version 1.0
 */
@Getter @Setter
@NoArgsConstructor // construtor vazio
@AllArgsConstructor // construtos cheio
public class Client {

    private String name;
    private String lastname;
    private double age;

    /**
     *
     * @return Retorna metodo para calcular a idade em meses
     */
    public double calculateAgeInMonths(){
        return this.age * 12;
    }
}
