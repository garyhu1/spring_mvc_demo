package com.garyhu.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: garyhu
 * @Since: 2017/11/22 0022.
 * @Decription:
 */
public class UserController extends MultiActionController {

    public ModelAndView home(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView mvc = new ModelAndView("home");
        mvc.addObject("message","Home");
        return mvc;
    }

    public ModelAndView add(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView mvc = new ModelAndView("user");
        mvc.addObject("message","Add");
        return mvc;
    }

    public ModelAndView remove(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView mvc = new ModelAndView("user");
        mvc.addObject("message","Remove");
        return mvc;
    }
}
