package com.garyhu.dao.impl;

import com.garyhu.dao.ProductDao;
import com.garyhu.pojo.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {
    public void save(Product product) {
        getHibernateTemplate().save(product);
    }

    public void delete(Product product) {
        getHibernateTemplate().delete(product);
    }

    public void update(Product product) {
        getHibernateTemplate().update(product);
    }

    public Product getProductById(int id) {
        Product product = getHibernateTemplate().get(Product.class, id);
        return product;
    }
}
