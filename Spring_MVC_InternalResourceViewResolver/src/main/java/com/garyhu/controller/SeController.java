package com.garyhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: garyhu
 * @Since: 2017/11/22 0022.
 * @Decription:
 */
@Controller
public class SeController {

    @RequestMapping(value = "/se.html",method = RequestMethod.GET)
    public String se(ModelMap model){
        model.addAttribute("message","Hello Spring MVC");
        return "se";
    }

    @RequestMapping(value = "/hello.html",method = RequestMethod.GET)
    public String hello(ModelMap model){
        model.addAttribute("message","This is a Spring MVC XmlViewResolver");
        return "hello";
    }
}
