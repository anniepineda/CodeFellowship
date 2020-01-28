package com.anniePineda.codefellowship;


import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "home";
    }

}
