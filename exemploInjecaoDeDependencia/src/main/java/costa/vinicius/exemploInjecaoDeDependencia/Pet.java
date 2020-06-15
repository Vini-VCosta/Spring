package costa.vinicius.exemploInjecaoDeDependencia;

import costa.vinicius.exemploInjecaoDeDependencia.Interfaces.AnimalInterface;
import costa.vinicius.exemploInjecaoDeDependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 18:55
 * @version 1.0
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

//    Não neessario usar por causa do @Autowired
//    /**
//     *
//     * @param animalInterface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute(){
        animalInterface.communicate();
    }

//    Maneira acoplada1 Errada!
//    public void execute(){
//        animalInterface = new Cat();
//        animalInterface.communicate();
//    }
}
