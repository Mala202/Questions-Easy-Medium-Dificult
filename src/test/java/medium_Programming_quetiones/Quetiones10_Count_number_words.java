package medium_Programming_quetiones;

import java.util.Scanner;

public class Quetiones10_Count_number_words {
	
	public void main(String[] args) {  
        
		Scanner sn =new Scanner(System.in);
		System.out.println("Enter String");
		String c = sn.nextLine();
		int count = countnumberofwords(c);
		System.out.println("Number of Words in String= "+ count);
		
	   }

	private Integer countnumberofwords(String s) {
		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		for(int a=0;a<s.length();a++) {
			if(s.charAt(a)==' ' && s.charAt(a+1)!=' ') {
				count++;
			}
			
		}
		return count;
	} 
	
	
	}

