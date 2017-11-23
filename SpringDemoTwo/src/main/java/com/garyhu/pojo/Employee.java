package com.garyhu.pojo;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
public class Employee {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void initMsg(){
        System.out.println("message设置成功后调用 ："+this.message);
    }

    public void clearMsg(){
        System.out.println("Spring 被销毁后调用的方法");
    }
}
