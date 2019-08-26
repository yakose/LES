package dk.yakose.les.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yakos
 */


@Controller
public class MainController {    
    
    @RequestMapping(value={"", "/", "/index","/home"})
    public String home() {
        return "index.html";
    }

}
