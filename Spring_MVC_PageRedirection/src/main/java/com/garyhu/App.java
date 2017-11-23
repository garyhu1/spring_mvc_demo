package com.garyhu;

import java.math.BigDecimal;

/**
 * @author: garyhu
 * @Since: 2017/11/20 0020.
 * @Decription:
 */
public class App {

    public static void main(String[] args){
        double d1 = 434564321;
        double d2 = 0.06;
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        BigDecimal bigDecimal = b1.multiply(b2).setScale(2, BigDecimal.ROUND_HALF_UP);
        String s = bigDecimal.toString();
        System.out.println(s);
        double d3 = b1.multiply(b2).setScale(2,  BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
