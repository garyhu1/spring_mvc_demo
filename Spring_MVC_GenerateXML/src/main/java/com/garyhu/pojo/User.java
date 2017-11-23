package com.garyhu.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author: garyhu
 * @Since: 2017/11/23 0023.
 * @Decription:
 */
//@XmlRootElement(name = "user")
public class User {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

//    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

//    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
}
