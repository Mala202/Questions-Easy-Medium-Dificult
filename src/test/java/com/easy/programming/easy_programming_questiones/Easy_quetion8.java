package com.easy.programming.easy_programming_questiones;

import java.util.Scanner;

public class Easy_quetion8 {

	public static void main(String[] args) {
		// Write a Java program to implement a simple calculator.
		int operator, b1, b2;
		
		System.out.println("1 - add\n 2 - subtract \n3 - multiply \n4 - divide");
        System.out.println("choose operator: ");
        try (Scanner sc = new Scanner(System.in)) {
			operator = sc.nextInt();
			System.out.println("Enter first number : ");
			b1 = sc.nextInt();
			System.out.println("Enter second number : ");
			b2 = sc.nextInt();
		}
        int result = 0;
        switch(operator) {
        case 1:
        	result = b1 + b2;
        	break;
        	
        case 2:
        	result = b1 - b2;
        	break;
        	
        case 3:
        	result = b1 * b2;
        	break;
        	
        case 4:
        	result = b1 / b2;
        	break;

        	default:
        		System.out.println("Entered operator is not valid");
	}
        System.out.println("Result is : " + result);
        


	}
}