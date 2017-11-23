package com.garyhu.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Repository;

/**
 * @author: garyhu
 * @Since: 2017/11/17 0017.
 * @Decription:
 */
@Aspect
@Repository
public class Logging {

    @Before(value = "execution(* com.garyhu.pojo.*.*(..))")
    public void beforeAdvice(){
        System.out.println("【beforeAdvice】Going to set Student profile .");
    }
}
