/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    protected int credits;
    protected double gpa;

    public Student(String name, int age, String address, int credits, double gpa) {
        super(name, age, address);
        this.credits = credits;
        this.gpa = gpa;
    }

    // Getters
    public int getCredits() {
        return credits;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", age=" + age + ", address=" + address + ", credits=" + credits + ", GPA=" + gpa + "}";
    }
}
