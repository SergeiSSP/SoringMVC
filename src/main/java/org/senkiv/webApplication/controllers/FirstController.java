package org.senkiv.webApplication.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/bye")
    public String goodByePage(@RequestParam(value="name", required = false)String name,
                              @RequestParam(value="surname",required = false) String surname,
                              Model model){
        model.addAttribute("message", "Hello " + name + " " + surname);

        return "first/bye";
    }

    @GetMapping("/greet")
    public String sayHelloPage(){
        return "first/hi";
    }
}
