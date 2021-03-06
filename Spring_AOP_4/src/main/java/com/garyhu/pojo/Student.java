package com.garyhu.pojo;

import com.garyhu.Loggable;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: garyhu
 * @Since: 2017/11/17 0017.
 * @Decription:
 */
@Service("student")
public class Student {

    private int id;
    private String name="Juddy";

    public int getId() {
        return id;
    }

    @Autowired(required = false)
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        System.out.println("Name : "+name);
        return name;
    }

    @Autowired(required = false)
    @Loggable
    public void setName(String name) {
        this.name = name;
    }
}
