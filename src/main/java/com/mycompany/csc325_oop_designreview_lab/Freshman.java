package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    public Freshman(String name, int age, String address, int credits) {
        super(name, age, address, credits, 0.0); // Default GPA of 0.0
    }

    @Override
    public String toString() {
        return "Freshman{name=" + name + ", age=" + age + ", address=" + address + ", credits=" + credits + ", GPA=" + gpa + "}";
    }
}



