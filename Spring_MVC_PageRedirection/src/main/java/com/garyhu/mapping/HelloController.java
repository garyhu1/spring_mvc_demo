package com.garyhu.mapping;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: garyhu
 * @Since: 2017/11/22 0022.
 * @Decription:
 */
public class HelloController extends AbstractController {

    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mvc = new ModelAndView("hello");
        mvc.addObject("message","Hello World!");
        return mvc;
    }
}
