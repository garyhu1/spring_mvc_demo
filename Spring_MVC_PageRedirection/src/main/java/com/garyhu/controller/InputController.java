package com.garyhu.controller;

import com.garyhu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: garyhu
 * @Since: 2017/11/20 0020.
 * @Decription: 表单控制类
 */
@Controller
public class InputController {

    @Autowired(required = false)
    @Qualifier("studentValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder){
        binder.setValidator(validator);
    }

    @RequestMapping(value = "/student" ,method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student","command",new Student());
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") @Validated Student student, BindingResult bindingResult,ModelMap model){
//        if(bindingResult.hasErrors()){
//            return "addStudent";
//        }
        System.out.println("id = "+student.getId());
        model.addAttribute("id",student.getId());
        model.addAttribute("name",student.getName());
        model.addAttribute("age",student.getAge());
        model.addAttribute("receivePaper",student.isReceivePaper());
        model.addAttribute("gender",student.getGender());
        model.addAttribute("color",student.getColor());
        model.addAttribute("city",student.getCity());
        model.addAttribute("tec",student.getTec());
        return "result";
    }

    @RequestMapping(value = "/result",method = RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("student") Student student,ModelMap model){
        System.out.println("id = "+student.getId());
        ModelAndView mav = new ModelAndView("result");
        mav.addObject("id",student.getId());
        mav.addObject("name",student.getName());
        mav.addObject("age",student.getAge());
//        model.addAttribute("id",student.getId());
//        model.addAttribute("name",student.getName());
//        model.addAttribute("age",student.getAge());
        return mav;
    }
}
