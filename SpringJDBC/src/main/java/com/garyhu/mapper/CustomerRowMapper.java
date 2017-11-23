package com.garyhu.mapper;

import com.garyhu.pojo.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: garyhu
 * @Since: 2017/11/13 0013.
 * @Decription:
 */
public class CustomerRowMapper implements RowMapper {
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer c = new Customer();
        c.setId(resultSet.getInt(1));
        c.setName(resultSet.getString(2));
        c.setSex(resultSet.getString(3));
        return c;
    }
}
