package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondHelloController {

    @RequestMapping("hello2")
    public String hello2(Model model){
        model.addAttribute("greeting","반갑습니당");
        return "hello";
    }
}
