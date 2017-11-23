package com.garyhu.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport {

    @Autowired
    public void anyMethodName(SessionFactory sessionFactory){
        setSessionFactory(sessionFactory);
    }
}
