package com.safecornerscoffee.mocha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping
    public String indexPage(Model model) {
        model.addAttribute("title", "Mocha");
        model.addAttribute("message", "hello, Mocah");
        return "index";
    }

}
