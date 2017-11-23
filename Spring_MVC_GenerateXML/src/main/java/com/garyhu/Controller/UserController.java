package com.garyhu.Controller;

import com.garyhu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: garyhu
 * @Since: 2017/11/23 0023.
 * @Decription:
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/{name}",method = RequestMethod.GET)
    public @ResponseBody User getUser(@PathVariable(value = "name") String name){
        User user = new User();
        user.setName(name);
        user.setId(1);
        return user;
    }
}
