package ru.gothmog.rti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gothmog on 12.01.2017.
 */
@Controller
public class AppController {

    @GetMapping(value = "/")
    public String index(Model model) {
      //  model.addAttribute("index", "Hello RTI");
        return "index";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping(value = "/registration")
    public String registrationPage(){
        return "registration";
    }

}
