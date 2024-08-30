
package com.easy.programming.easy_programming_questiones;

public class Easy_quetiones7 {

	public static void main(String[] args) {
		// Write a Java program to reverse a given string.
         
		String originalstr = "Welcome";
		String reversedstr = "";
		
		for (int c = 0; c < originalstr.length(); c++) {
			reversedstr = originalstr.charAt(c) + reversedstr;
			
		}
		System.out.println("Reversed string: " + reversedstr);
	}
           
}
