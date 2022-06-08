package com.example.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/admin")
    public String admin( ){
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
        return "admin";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/info")
    public Object info(Authentication authentication){
        System.out.println(authentication.getPrincipal().toString());
        return "home";
    }

    @GetMapping("/user")
    public String user(Authentication authentication){
        System.out.println(authentication.getName());
        return "User";
    }
}
