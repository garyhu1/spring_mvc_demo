package com.garyhu.pojo;

import java.io.Serializable;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
public class Product  implements Serializable {
    private static final long serializableVersionUID = 1L;

    private int id;
    private String name;
    private float price;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
