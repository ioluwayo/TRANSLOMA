package com.ioluwayo.translator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RootController {
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
