package com.example.springboottest3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class guguController {
   // @Auto
    // 1-1
    @GetMapping("/front/gugu")
    public String guguFrontIsKey(Model model, @RequestParam("key") int key){
        model.addAttribute("key", key);
        return "frontEnd/guguFrontKey";
    }

    // 1-2


    // 2-1
    @GetMapping("/front/gugu/{key}")
    public String guguFront(Model model, @PathVariable("key") int key){
        model.addAttribute("key", key);
        return "frontEnd/guguFront";
    }

    // 2-2



}
