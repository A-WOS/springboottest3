package com.example.springboottest3.test.controller;

import com.example.springboottest3.test.Dto.guguDto;
import com.example.springboottest3.test.component.guguComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class guguController {
    // Dependency Injection(DI) : 의존성 주입.
    // @Autowired를 이용하여 guguComponet객체를 사용.
    @Autowired
    guguComponent gcp;
    // 1-1
    @GetMapping("/front/gugu")
    public String guguFrontIsKey(Model model, @RequestParam("key") int key){
        model.addAttribute("key", key);
        return "frontEnd/guguFrontKey";
    }

    // 1-2
    @GetMapping("/back/gugu")
    public String guguBackIsKey(Model model, @RequestParam("key") int key){
        List<guguDto> listgugudan = gcp.createDan(key);
        model.addAttribute("listgugudan", listgugudan);
        model.addAttribute("key", key);
        return "backEnd/guguBackKey";
    }


    // 2-1
    @GetMapping("/front/gugu/{key}")
    public String guguFrontNonKey(Model model, @PathVariable("key") int key){
        model.addAttribute("key", key);
        return "frontEnd/guguFront";
    }

    // 2-2
    @GetMapping("/back/gugu/{key}")
    public String  guguBackNonKey(Model model, @PathVariable("key") int key){
        List<guguDto> listGugudan = gcp.createDan2(key);
        model.addAttribute("listGugudan", listGugudan);
        model.addAttribute("key", key);
        return "backEnd/guguBack";
    }



}
