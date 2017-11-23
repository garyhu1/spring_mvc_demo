package com.garyhu.impl;

import com.garyhu.inter.OutGenerator;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class CvsOutGenerator implements OutGenerator {
    public void out(String msg) {
        System.out.println("Cvs--->"+msg);
    }
}
