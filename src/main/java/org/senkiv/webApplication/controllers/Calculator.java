package org.senkiv.webApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class Calculator {
    @GetMapping("/calculate")
    public String calculator(@RequestParam(name="a", required = false) int firstNumber,
                             @RequestParam(name="b", required = false) int secondNumber,
                             @RequestParam(name="action", required = false) String action,
                             Model model) {
        double result;
        switch (action) {
            case "multiplication":
                result = firstNumber * secondNumber;
                break;

            case "addition":
                result = firstNumber + secondNumber;
                break;

            case "substraction":
                result = firstNumber - secondNumber;
                break;

            case "division":
                result = firstNumber / (double)secondNumber;
                break;

            default:
                result = 0;
                break;
        }
        model.addAttribute("result", result);
        return "calculator/result_page";
    }
}
