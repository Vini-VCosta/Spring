package costa.vinicius.exemploHelloWorldLombok.controllers;

import costa.vinicius.exemploHelloWorldLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 18:10
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Exemplo Lombok";
    }




}
