package modeloprojeto.stocks.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/victor/api")
    public String check() {
        return "Se voce nasceu pobre, estude muito para ser um progamador!";
    }
}
