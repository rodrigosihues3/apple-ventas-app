package com.applestore.apple_ventas_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController {
    
    @GetMapping("/")
    public String home() {        
        return "index"; // Retorna la vista index.html en templates/
    }
    

}
