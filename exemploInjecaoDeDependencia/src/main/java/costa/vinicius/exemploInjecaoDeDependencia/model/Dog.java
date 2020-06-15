package costa.vinicius.exemploInjecaoDeDependencia.model;

import costa.vinicius.exemploInjecaoDeDependencia.Interfaces.AnimalInterface;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 18:50
 * @version 1.0
 */
@CommonsLog
@Qualifier("dog")
@Primary
public class Dog implements AnimalInterface {

    /**
     * @return Retorna um metodo vindo da Interface
     */
    @Override
    public void communicate() {
        System.out.println("Au au");
    }
}
