package com.garyhu.impl;

import com.garyhu.dao.CustomerDao;
import com.garyhu.pojo.Customer;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author: garyhu
 * @Since: 2017/11/13 0013.
 * @Decription:
 */
public class JdbcCustomerDao extends JdbcDaoSupport implements CustomerDao {
    public void insert(Customer c) {
        String sql = "insert into customer (name,sex) values (?,?)";
        getJdbcTemplate().update(sql,new Object[]{c.getName(),c.getSex()});
    }

    public Customer findCustomerById(int id) {
        return null;
    }
}
