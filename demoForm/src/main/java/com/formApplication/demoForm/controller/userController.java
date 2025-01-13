package com.formApplication.demoForm.controller;

import com.formApplication.demoForm.Entity.UserDetails;
import com.formApplication.demoForm.repository.userRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class userController {


    @Autowired
private userRepository repo;


@GetMapping ("/")
public String home(){
        return "index";
    }

    @GetMapping("/feeds")
    public String userFeed(){
    return "feeds";
    }

    @GetMapping("/gallery")
    public String myGallery(){
    return "gallery";
    }

//    @GetMapping("/research")
//    public String myResearch{
//        return "research";
//    }
    @GetMapping("/research")
    public String myResearch(){
    return "research";
    }



    @PostMapping("/feedBack")
    public String feedBack(@ModelAttribute UserDetails u){
//    System.out.println(u);
    repo.save(u);
//    session.setAttribute("message","sends successfully...!");
    return "redirect:feeds";

    }
}
