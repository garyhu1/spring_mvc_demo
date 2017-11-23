package com.garyhu.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: garyhu
 * @Since: 2017/11/23 0023.
 * @Decription:
 */
public class PDFController extends AbstractController {

    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Map<String,String> userData = new HashMap<String,String>();
        userData.put("100", "Xiao.Lu");
        userData.put("102", "User 102");
        userData.put("301", "User 301");
        userData.put("400", "User 400");
        return new ModelAndView("UserSummary","userData",userData);
    }
}
