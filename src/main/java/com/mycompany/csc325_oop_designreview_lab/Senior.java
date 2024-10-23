package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    public Senior(String name, int age, String address, int credits) {
        super(name, age, address, credits, 0.0); // Default GPA of 0.0
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits.");
        }
    }

    @Override
    public String toString() {
        return "Senior{name=" + name + ", age=" + age + ", address=" + address + ", credits=" + credits + ", GPA=" + gpa + "}";
    }
}

