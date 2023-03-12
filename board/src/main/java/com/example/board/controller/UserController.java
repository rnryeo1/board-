package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/userRegForm")
    public String userRegForm()
    {
        return "userRegForm";
    }

    @PostMapping("/userReg")
    public String userReg(
        @RequestParam("name") String name,
        @RequestParam("email") String email,
        @RequestParam("password") String password


    ){
        return "redirect:/welcome";  //브라우저에게 자동으로 welcome 으로 이동
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
