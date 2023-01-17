package com.example.exercisecurrencyexchangewebapp.controller;

import jdk.internal.icu.text.NormalizerBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @RequestMapping(value = "/")
    public ModelAndView showForm() {
        return new ModelAndView("form");
    }

    @PostMapping(value = "/exchange")
    public ModelAndView exchange(@RequestParam("usd") int usd, @RequestParam("exchangeRatio") int ratio) {
        int total = usd * ratio;
        ModelAndView modelAndView = new ModelAndView("result", "total", total);
        return modelAndView;
    }
}
