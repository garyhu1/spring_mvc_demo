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
public class StudentController extends MultiActionController {

    public ModelAndView home(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView mvc = new ModelAndView("student");
        mvc.addObject("message","主页面(home方法)");
        return mvc;
    }

    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mvc = new ModelAndView("student");
        mvc.addObject("message","添加(add方法)");
        return mvc;
    }

    public ModelAndView remove(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView mvc = new ModelAndView("student");
        mvc.addObject("message","删除(remove方法)");
        return mvc;
    }
}
