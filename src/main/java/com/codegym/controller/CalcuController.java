package com.codegym.controller;

import com.codegym.model.Calculator;
import com.codegym.service.CalcuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/calculator")
public class CalcuController {

    @Autowired
    CalcuService calcuService;

    @GetMapping("")
    public ModelAndView show(@ModelAttribute("calculator") Calculator calculator, @RequestParam(defaultValue = "") String pt) {
        int result = 0;
        switch (pt) {
            case "sum": {
                result = calcuService.sum(calculator.getNumber1(), calculator.getNumber2());
                break;
            }
            case "sub": {
                result = calcuService.sub(calculator.getNumber1(), calculator.getNumber2());
                break;
            }
            case "multi": {
                result = calcuService.multi(calculator.getNumber1(), calculator.getNumber2());
                break;
            }
            case "div": {
                result = calcuService.div(calculator.getNumber1(), calculator.getNumber2());
                break;
            }
        }
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/result.jsp");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
