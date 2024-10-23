/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a Freshman and a Senior
        Freshman std1 = new Freshman("James", 18, "123 College St", 12);
        Senior std2 = new Senior("John", 22, "456 University Ave", 90);

        // Prompt for GPA for Freshman
        System.out.print("Enter GPA for Freshman (James): ");
        std1.gpa = scanner.nextDouble();

        // Prompt for GPA for Senior
        System.out.print("Enter GPA for Senior (John): ");
        std2.gpa = scanner.nextDouble();

        // Print the details of both students
        System.out.println(std1);
        System.out.println(std2);

        // Close the scanner
        scanner.close();
    }
}
