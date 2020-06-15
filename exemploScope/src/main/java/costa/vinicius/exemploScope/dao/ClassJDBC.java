package costa.vinicius.exemploScope.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Vinicius Costa
 * @since 11/06/2020 - 00:27
 * @version 1.0
 */
@Component
//1 maneira
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

//2 maneira
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC");
    }
}
