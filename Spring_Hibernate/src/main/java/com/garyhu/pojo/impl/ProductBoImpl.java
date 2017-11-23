package com.garyhu.pojo.impl;

import com.garyhu.dao.ProductDao;
import com.garyhu.pojo.Product;
import com.garyhu.pojo.ProductBo;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
public class ProductBoImpl implements ProductBo {

    ProductDao productDao;

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

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}
