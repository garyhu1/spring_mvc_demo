package com.garyhu.impl;

import com.garyhu.dao.CustomerDao;
import com.garyhu.pojo.Customer;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: garyhu
 * @Since: 2017/11/13 .
 * @Decription:
 */
public class CustomerDaoImpl implements CustomerDao {
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(Customer c) {
        String sql = "insert into customer (name,sex) values (?,?)";
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,c.getName());
            ps.setString(2,c.getSex());

            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if(ps!=null)
                    ps.close();
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Customer findCustomerById(int id) {
        String sql = "select * from cutomer where id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = dataSource.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();
            Customer c = new Customer();
            if(rs.next()){
                c.setName(rs.getString("name"));
                c.setSex(rs.getString("sex"));
            }
            return c;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if(ps!=null)
                    ps.close();
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
