package com.garyhu.dao;

import com.garyhu.pojo.Product;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
public interface ProductDao {

    void save(Product product);
    void delete(Product product);
    void update(Product product);
    Product getProductById(int id);
}
