package com.garyhu.impl;

import com.garyhu.inter.HelloWorld;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class HelloWorldImpl implements HelloWorld {
    public void sayHello(String msg) {
        System.out.println("Hello "+msg);
    }
}
