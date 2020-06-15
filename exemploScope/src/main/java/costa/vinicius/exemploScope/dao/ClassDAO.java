package costa.vinicius.exemploScope.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Vinicius Costa
 * @since 11/06/2020 - 00:29
 * @version 1.0
 */

//Lombok
@Getter @Setter

//Spring
@Component
//1 maneira
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

//2 maneira
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassDAO {

    @Autowired
    public ClassJDBC classJDBC;

}
