package medium_Programming_quetiones;

public class Quetiones6_bubble_sort {

	public static void main(String[] args) {
		//Write a Java program to implement bubble sort algorithm
		int arr[] = {23, 56, 89, 10, 60};
		int length = arr.length;
		
		System.out.print("Unsorted array :");
		for (int a=0; a< length;a++) 
			System.out.print(arr[a] + " ");
			
			for (int a = 0; a < length; a++) {
			   for(int g=1 ; g<length -a; g++) {
				if (arr[g-1] > arr[g]) {
					int temp = arr[g];
					arr[g] = arr[g-1];
					arr[g-1] = temp;
					
				}
			   }
			}
		System.out.println();
		System.out.print("Sorted array : ");
		for(int a = 0; a<length; a++)
			System.out.print(arr[a] + " ");

	}

}
