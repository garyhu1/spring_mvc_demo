package com.garyhu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class Product {

    private int id;
    private String name;
    private float price;
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //没有匹配到bean时就不会设置，如果没有required，匹配不到就会报错
    @Autowired(required = false)
    //当有多个相同类型的bean 的时候，会优先匹配categoryA，没有设置@Qualifer就会报错
    @Qualifier("categoryA")
    public void setCategory(Category category) {
        this.category = category;
    }
}
