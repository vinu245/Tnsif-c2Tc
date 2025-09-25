package com.basicprograms_tnsif;
import java.util.Scanner;


public class basicConcept {

		 // A simple method to add two numbers
	    static int add(int x, int y) {
	        return x + y;
	    }  

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 1. Variables and Input/Output
	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();
	        System.out.println("Hello, " + name + "!");

	        // 2. Arithmetic + Method call
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        int sum = add(a, b);
	        System.out.println("Sum of " + a + " and " + b + " is " + sum);

	        // 3. If–else
	        if (sum % 2 == 0) {
	            System.out.println("The sum is even.");
	        } else {
	            System.out.println("The sum is odd.");
	        }

	        // 4. For loop
	        System.out.println("Multiplication table of " + a + ":");
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(a + " x " + i + " = " + (a * i));
	        }

	        // 5. Arrays
	        System.out.print("Enter how many numbers you want to store: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("No numbers to store. Exiting array part.");
	        } else {
	            int[] numbers = new int[n];

	            System.out.println("Enter " + n + " numbers:");
	            for (int i = 0; i < n; i++) {
	                numbers[i] = sc.nextInt();
	            }

	            // 6. While loop: print array values
	            System.out.println("You entered:");
	            int i = 0;
	            while (i < n) {
	                System.out.print(numbers[i] + " ");
	                i++;
	            }
	            System.out.println();

	            // 7. Find max in array (simple logic)
	            int max = numbers[0];
	            for (int j = 1; j < n; j++) {
	                if (numbers[j] > max) {
	                    max = numbers[j];
	                }
	            }
	            System.out.println("Maximum number is: " + max);
	        }

	        sc.close();
	    
	    }
}




