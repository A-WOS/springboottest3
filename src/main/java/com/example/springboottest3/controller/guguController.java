package com.example.springboottest3.controller;

import lombok.NonNull;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// 컨트롤러 구현
@Controller
@RequestMapping(value="/front", method=RequestMethod.GET)//, method = RequestMethod.GET) // /front라는 경로로 들어오는 것을 정의
public class guguController {

    @GetMapping("/gugu") // gugu라는 함수의 mapping 경로는 /front/gugu가 됨.
    public String gugu(@RequestParam(name="key", required = false, defaultValue = "World") String key, Model model) {
        model.addAttribute("key", key);
        return "gugu"; // html name

    }


}



