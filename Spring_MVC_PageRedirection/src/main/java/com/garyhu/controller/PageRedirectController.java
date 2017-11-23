package com.garyhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: garyhu
 * @Since: 2017/11/20 0020.
 * @Decription:
 */
@Controller
public class PageRedirectController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(){
        return "main";
    }

    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage(){
        return "final";
    }

}
