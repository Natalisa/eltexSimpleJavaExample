package com.company;

import java.util.ArrayList;
public class Person{
    String name;
    ArrayList<String> phone = new ArrayList();
    public Person(String name, String phone){
        this.name = name;
        this.phone.add(phone);
    }
    public Person(String name){
        this.name = name;
    }
    public void addPhone(String phone){
        this.phone.add(phone);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", phone=" + this.phone +
                '}';
    }
    public static void main(String[] arg){
        Person newP = new Person("Nata","545645");
        newP.addPhone("545645");
        newP.addPhone("222222");
        System.out.println(newP.name);
        System.out.println(newP.phone);
    }
}