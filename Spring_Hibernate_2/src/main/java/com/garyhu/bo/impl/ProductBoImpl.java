package com.garyhu.bo.impl;

import com.garyhu.bo.ProductBo;
import com.garyhu.dao.ProductDao;
import com.garyhu.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
@Service("productBo")
public class ProductBoImpl implements ProductBo {

    @Autowired
    private ProductDao productDao;

    public void save(Product product) {
        productDao.save(product);
    }

    public void delete(Product product) {
        productDao.delete(product);
    }

    public void update(Product product) {
        productDao.update(product);
    }

    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }
}
