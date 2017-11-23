package com.garyhu.body;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: garyhu
 * @Since: 2017/11/23 0023.
 * @Decription:
 */
@Controller
public class BodyController {
    @RequestMapping("/saveResult")
    public @ResponseBody String getString(){
        return "save";
    }
}
