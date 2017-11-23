package com.garyhu.util;

import com.garyhu.inter.OutGenerator;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class OuterHelper {
    private OutGenerator generator;

    public OuterHelper(OutGenerator generator){
        this.generator = generator;
    }

    public void print(String msg){
        generator.out(msg);
    }
}
