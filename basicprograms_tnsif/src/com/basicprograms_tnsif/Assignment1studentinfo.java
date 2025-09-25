package com.basicprograms_tnsif;
import java.util.Scanner;
public class Assignment1studentinfo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // --- 1. Get Input from User ---

        System.out.println("Enter your Full Name with Initial :");
        String fullName = scanner.nextLine();

        System.out.println("Enter your Roll Number or Student ID :");
        String rollNumber = scanner.nextLine(); // Reading as String to handle any leading zeros or non-numeric characters

        System.out.println("Enter your Grade :");
        String grade = scanner.nextLine();

        System.out.println("Enter your Percentage :");
        String percentage = scanner.nextLine();

        // Close the scanner object
        scanner.close();
        
        // --- 2. Display Output (Sample Output Format) ---
        
        System.out.println("\n--- Sample Output ---");
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);
        System.out.println("---------------------");
    }


	}


