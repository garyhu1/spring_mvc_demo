package com.garyhu.config;

import com.garyhu.impl.HelloWorldImpl;
import com.garyhu.inter.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
@Configuration
public class AppConfig {

    @Bean(name="helloWorld")
    public HelloWorld getHelloWorld(){
        return new HelloWorldImpl();
    }
}
