package com.github.frosch.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomePageController {

    @RequestMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView homePage() {
        return new ModelAndView("forward://index.html");
    }
}
