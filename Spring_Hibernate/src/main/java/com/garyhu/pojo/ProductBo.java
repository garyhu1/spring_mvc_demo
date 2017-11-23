package com.garyhu.pojo;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
public interface ProductBo {

    void save(Product product);
    void delete(Product product);
    void update(Product product);
    Product getProductById(int id);
}
