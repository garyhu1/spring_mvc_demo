package com.garyhu.dao;

import com.garyhu.pojo.Customer;

/**
 * @author: garyhu
 * @Since: 2017/11/13.
 * @Decription: 数据库操作接口
 */
public interface CustomerDao {

    void insert(Customer c);
    Customer findCustomerById(int id);
}
