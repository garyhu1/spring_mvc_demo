package com.garyhu.pojo;

/**
 * @author: garyhu
 * @Since: 2017/11/16 0016.
 * @Decription:
 */
public class Student {

    private int id;
    private String name;
    private int age;

    public int getId() {
        System.out.println("ID : "+id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        System.out.println("Name : "+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("Age : "+age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
