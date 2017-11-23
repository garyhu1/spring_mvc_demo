package com.garyhu.pojo;

/**
 * @author: garyhu
 * @Since: 2017/11/13 0013.
 * @Decription:
 */
public class Customer {

    private int id;
    private String name;
    private String sex;
    private Person person;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
