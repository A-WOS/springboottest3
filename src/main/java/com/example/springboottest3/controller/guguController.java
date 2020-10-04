package com.example.springboottest3.controller;

import com.example.springboottest3.gugudan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 컨트롤러 구현
@Controller
@RequestMapping(method=RequestMethod.GET, value="/front/gugu?key={num}")
public class guguController {
    public String gugu(@PathVariable("num") int num) {
        gugudan gudan = new gugudan(num);
        gudan.cal();

        return "gugu";

    }
}
