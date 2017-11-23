package com.garyhu.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
@Entity
@Table(name="product_",uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
        @UniqueConstraint(columnNames = "price")
})
public class Product implements Serializable {
    private int id;
    private String name;
    private float price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name", unique = true, nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price", unique = true, nullable = false)
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
