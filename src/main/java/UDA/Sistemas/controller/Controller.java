package UDA.Sistemas.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api")
public class Controller {
    @GetMapping("/responde")
    public String teRespondo(){
        return "Desde el controlador";
    }
}
