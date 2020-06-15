package costa.vinicius.exemploHelloWorldLombok.controllers;

import costa.vinicius.exemploHelloWorldLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Vinicius Costa
 * @since 10/06/2020 - 18:27
 * @version 1.0
 */
@RestController
public class ClientController {

    @GetMapping("/clients")
    public ArrayList<Client> getClients(){

        ArrayList<Client> clients = new ArrayList<>();

        //base de dados... banco de dados
        Client client = new Client();
        client.setName("Vinicius");
        client.setLastname("Costa");
        client.setAge(18);

        Client client1 = new Client();
        client1.setName("Zerdax");
        client1.setLastname("Costa");
        client1.setAge(18);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
