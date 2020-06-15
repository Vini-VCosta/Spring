package costa.vinicius.exemploHellowordRestRepositeries.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 15:33
 * @verssion 1.0
 */
@RestController
public class HelloWordController {

    @GetMapping("/")
    public String index(){
        return "Olá! Hello Word com rest repositeries";
    }
}
