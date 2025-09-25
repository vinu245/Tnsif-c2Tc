package com.vinutha.assignment2; 

import java.util.Scanner; 
/**
 * File: SalesEmployee.java
 * Defines the sales employee data members, methods to accept details, 
 * and a method to calculate commission based on sales amount.
 */
public class SalesEmployee {

    // Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;
    private double commission;

    /**
     * Member method to accept details (Name, Address, Phone, Sales_amount).
     */
    public void acceptDetails() {
        // FIX 1: Scanner is defined correctly because of the import
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); 
        
        System.out.println("\n--- Enter Sales Employee Details ---");
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        
        System.out.print("Enter Address: ");
        this.address = scanner.nextLine();
        
        System.out.print("Enter Phone: ");
        this.phone = scanner.nextLine();
        
        System.out.print("Enter Sales Amount: ");
        this.salesAmount = scanner.nextDouble();
    }

    /**
     * Member method to calculate the commission based on the sales amount.
     */
    public void calculateCommission() {
        if (this.salesAmount >= 100000) {
            this.commission = this.salesAmount * 0.10; // 10%
        } else if (this.salesAmount >= 50000) {
            this.commission = this.salesAmount * 0.05; // 5%
        } else if (this.salesAmount >= 30000) {
            this.commission = this.salesAmount * 0.03; // 3%
        } else {
            this.commission = 0.0; // No commission
        }
    }
    
    /**
     * Member method to display all employee and commission details.
     */
    public void displayDetails() {
        System.out.println("\n--- Sales Employee Report ---");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phone);
        System.out.printf("Sales Amount: $%.2f%n", this.salesAmount);
        System.out.printf("Commission: $%.2f%n", this.commission);
        System.out.printf("Total Payout: $%.2f%n", (this.salesAmount + this.commission));
        System.out.println("-----------------------------");
    }

    /**
     * Main method to create objects of Student and SalesEmployee and call the member methods.
     */
    public static void main(String[] args) {
        
        // 1. Create an object of the Student class
        System.out.println("--- Student Object Demonstration ---");
        new Student(); 
        System.out.println("------------------------------------");

        // 2. Create an object of the SalesEmployee class
        SalesEmployee employee = new SalesEmployee();
        
        // 3. Call the member methods
        employee.acceptDetails();
        employee.calculateCommission();
        employee.displayDetails();
    }
}