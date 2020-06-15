package costa.vinicius.exemploInjecaoDeDependencia.model;

import costa.vinicius.exemploInjecaoDeDependencia.Interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 18:52
 * @version 1.0
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    /**
     * @return Retorna um metodo vindo da Interface
     */
    @Override
    public void communicate() {
        System.out.println("Miauu");
    }
}
