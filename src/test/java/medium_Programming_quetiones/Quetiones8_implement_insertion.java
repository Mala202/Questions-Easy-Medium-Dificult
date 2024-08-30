package medium_Programming_quetiones;

public class Quetiones8_implement_insertion {
	
	public static void main(String[] args) {
		//Write a Java program to implement insertion sort algorithm.
		int array[]= {20, 23, 30, 10};
		int length = array.length;
		
		System.out.print("Unsorted array : ");
		for(int a = 0; a < length; a++)
			System.out.print(array[a] + " ");
		
		for (int a = 1; a <length; a++) {
			int basic = array[a];
			int b = a - 1;
			
			while(b >= 0 && array[b] > basic) {
				array[b+1] = array[b];
				b = b - 1; 
				
			}
			array[b+1] = basic;
		}
		System.out.println();
		
		System.out.print("Sorted array : ");
		for(int a = 0; a < length; a++)
			System.out.print(array[a] + " ");
				
		}
 
	}


