package com.example.springboottest3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 컨트롤러 구현
@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method=RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
