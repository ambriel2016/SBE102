package com.cristian.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myVar", "Say hello to the people.");
        model.addAttribute("myVar2", "They are looking for two objects missing.");
        return "index";
    }
}
