package ru.gothmog.rti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gothmog on 12.01.2017.
 */
@Controller
public class AppController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("index", "Hello RTI");
        return "index";
    }
}
