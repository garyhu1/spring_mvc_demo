package com.garyhu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
@Component("emailBean")
public class Email {
    // email regular expression
    String emailRegEx = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)" +
            "*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    @Value("hww9081020@163.com")
    private String emailAddress;
    @Value("#{emailBean.emailAddress matches emailBean.emailRegEx}")
    private boolean validEmail;
}
