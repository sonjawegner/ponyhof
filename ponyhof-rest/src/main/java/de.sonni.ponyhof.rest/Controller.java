package de.sonni.ponyhof.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by s.wittke on 05.06.2016.
 */
@RestController
public class Controller {

    @RequestMapping("/pony/{id}")
    public Pony viewPony(@PathVariable String id) {
        if (id.equals("1")) {
            return new Pony("Blinky");
        }
        return new Pony("Scarlett");
    }

    @RequestMapping("/")
    public String home() {
        return "Hi there";
    }
}
