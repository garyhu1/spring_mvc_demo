package com.garyhu.test;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription: 测试99乘法口诀
 */
public class Test99 {

    public static void main(String[] args){
        for(int i = 1;i <= 9;i++){
            for (int j = 0; j < i; j++) {
                if(j==i-1){
                    System.out.print((j+1)+"*"+i+" = "+((j+1)*i)+"\n");
                }else {
                    System.out.print((j+1)+"*"+i+" = "+((j+1)*i)+"\t");
                }
            }
        }
    }
}
