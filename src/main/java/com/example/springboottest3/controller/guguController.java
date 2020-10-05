package com.example.springboottest3.controller;

import com.example.springboottest3.component.GugudanComp;
import com.example.springboottest3.dto.GugudanDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 컨트롤러 구현
@Controller
@RequestMapping(method=RequestMethod.GET)//, method = RequestMethod.GET) // /front라는 경로로 들어오는 것을 정의
public class guguController {
    @Autowired private GugudanComp gugudanComp;

    @GetMapping("/front/gugu") // gugu라는 함수의 mapping 경로는 /front/gugu가 됨.
    public String dispGuguf(Model model, @RequestParam(name = "key", required = false, defaultValue = "5") int key) {
        model.addAttribute("key", key);

        return "front/guguf"; // html name
    }

    @GetMapping("/backend/gugu") // gugu라는 함수의 mapping 경로는 /backend/gugu가 됨.
    public String dispBackendGugu(Model model, @RequestParam(name = "key", required = false, defaultValue = "5") int key) {
        // Init
        List<GugudanDto> listGugudan = gugudanComp.createDan(key);

        model.addAttribute("key", key);
        model.addAttribute("listGugudan", listGugudan);

        return "back/gugub"; // html name
    }

    @GetMapping("/front/gugu/{key}")
    public String dispFrontGuguList(Model model, @PathVariable("key") int key) {
        model.addAttribute("key", key);

        return "front/guguFK";
    }

    @GetMapping("/backend/gugu/{key}")
    public String dispBackGuguList(Model model, @PathVariable("key") int key) {
        List<GugudanDto> listGuguBack = gugudanComp.createDan2(key);
        model.addAttribute("key", key);
        model.addAttribute("listGuguBack", listGuguBack);

        return "back/guguBK";
    }

}



