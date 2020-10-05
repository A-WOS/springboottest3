package com.example.springboottest3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// 컨트롤러 구현
@Controller
@RequestMapping(method=RequestMethod.GET)//, method = RequestMethod.GET) // /front라는 경로로 들어오는 것을 정의
public class guguController {
    @GetMapping("/front/gugu") // gugu라는 함수의 mapping 경로는 /front/gugu가 됨.
    public String guguf(Model model, @RequestParam(name = "key", required = false, defaultValue = "5") int key) {
        model.addAttribute("key", key);

        return "guguf"; // html name
    }

    @GetMapping("/backend/gugu") // gugu라는 함수의 mapping 경로는 /backend/gugu가 됨.
    public String gugub(Model model, @RequestParam(name = "key", required = false, defaultValue = "5") int key) {
        model.addAttribute("key", key);

        return "gugub"; // html name
    }

    @GetMapping("/front/gugu/{key}")
    public String dispFrontGuguList(Model model, @PathVariable("key") int key) {
        model.addAttribute("key", key);

        return "front/guguFK";
    }
}



