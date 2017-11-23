package com.garyhu.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
@Component("animal")
public class Animal {

    @Value("#{cat}")
    private Cat cat;
    @Value("#{cat.name}")
    private String name;
    @Value("#{cat.getFullName('hello')}")
    private String fullName;
    @Value("#{cat.maps['MapA']}")
    private String mapA;
    @Value("#{cat.items[0]}")
    private String listA;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void print(){
        System.out.println(cat.isBig());
    }

    public String getMapA() {
        return mapA;
    }

    public void setMapA(String mapA) {
        this.mapA = mapA;
    }

    public String getListA() {
        return listA;
    }

    public void setListA(String listA) {
        this.listA = listA;
    }
}
