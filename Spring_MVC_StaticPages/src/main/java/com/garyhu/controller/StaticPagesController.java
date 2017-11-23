package com.garyhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: garyhu
 * @Since: 2017/11/20 0020.
 * @Decription: 控制类
 */
@Controller
public class StaticPagesController {

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String main(){
        return "main";
    }

    @RequestMapping(value = "/staticPages", method = RequestMethod.GET)
    public String staticPages(){
        return "redirect:/pages/final.html";
    }
}
