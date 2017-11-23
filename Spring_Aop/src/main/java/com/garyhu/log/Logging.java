package com.garyhu.log;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription: Advice
 */
public class Logging {

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    public void beforeAdvice(){
        System.out.println("Going to setup Student profile");
    }

    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    public void afterAdvice(){
        System.out.println("Student profile has been setup");
    }

    /**
     * This is the method which I would like to execute
     * when any method return.
     */
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning : "+retVal.toString());
    }

    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    public void afterThrowingAdvice(IllegalArgumentException e){
        System.out.println("there has been an exception : "+e.toString());
    }

    public String aroundAdvice(ProceedingJoinPoint joinPoint)throws  Throwable{
        System.out.println("【In Around advice】");
        Object[] args = joinPoint.getArgs();
        System.out.println("args length : "+args.length);
        if(args.length>0){
            System.out.print("Arguments passed : ");
            for (int i = 0; i < args.length; i++) {
                System.out.print("args"+(i+1)+" : "+args[i]);
            }
        }
        Object result = joinPoint.proceed(args);
        System.out.println("Returning : "+result);
        return result.toString();
    }
}
