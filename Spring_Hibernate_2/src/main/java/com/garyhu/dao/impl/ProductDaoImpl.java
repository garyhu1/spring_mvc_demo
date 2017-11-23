package com.garyhu.dao.impl;

import com.garyhu.dao.ProductDao;
import com.garyhu.pojo.Product;
import com.garyhu.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
@Repository("productDao")
public class ProductDaoImpl extends CustomHibernateDaoSupport implements ProductDao {
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
        return getHibernateTemplate().get(Product.class,id);
    }
}
