/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Human {
    protected String name;
    protected int age;
    protected String address;

    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Human{name=" + name + ", age=" + age + ", address=" + address + "}";
    }
}
