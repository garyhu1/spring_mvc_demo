package com.garyhu.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
public class Worker {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @PostConstruct
    public void initDate(){
        System.out.println("初始化成功后的时间为 ： "+date.toString());
    }

    @PreDestroy
    public void clearDate(){
        System.out.println("清除Spring");
    }
}
