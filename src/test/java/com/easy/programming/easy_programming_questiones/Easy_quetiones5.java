package com.easy.programming.easy_programming_questiones;

public class Easy_quetiones5 {

	public static void main(String[] args) {
		//Write a Java program to check if a given number is prime or not.
		
		int number = 28;
		boolean flag = false;
		for (int b = 3; b <= number / 2; ++b) {
		
			if (number % b == 0) {
				flag = true;
				break;
			}
		}
		
		if (flag)
			System.out.println(number + "is a prime number. ");
		else
			System.out.println(number + "is not a prime number ");

	}

}
