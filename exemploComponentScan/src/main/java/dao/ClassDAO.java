package dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.server.ServerEndpoint;

/**
 * @author Vinicius Costa
 * @since 11/06/2020 - 00:55
 * @version 1.0
 */
@Getter @Setter
@Component
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
