package com.garyhu.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
@Component("cat")
public class Cat {
    @Value("1.5")
    private float age;
    @Value("kitty")
    private String name;
    @Value("#{cat.age>10}")
    private boolean isBig;
    @Value("#{'miao'.toUpperCase()}")
    private String asia;
    @Value("#{cat.age<1?false:true}")
    private boolean warning;
    private List<String> items;
    private Map<String,String> maps;

    public Cat(){
        maps = new HashMap<String, String>();
        maps.put("MapA", "This is MapA");
        maps.put("MapB", "This is MapB");
        maps.put("MapC", "This is MapC");

        items = new ArrayList<String>();
        items.add("List0");
        items.add("List1");
        items.add("List2");
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public String getFullName(String first){
        return first+" "+ name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    public String getAsia() {
        return asia;
    }

    public void setAsia(String asia) {
        this.asia = asia;
    }

    public boolean isWarning() {
        return warning;
    }

    public void setWarning(boolean warning) {
        this.warning = warning;
    }
}
