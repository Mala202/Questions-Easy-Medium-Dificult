package difficult_Programing_Quetiones;

import java.util.Arrays;

public class Quetion3_Array_Objects {


		  static int partition(int array[], int low, int high) {
		    		   
		    int pivot = array[high];
		    		
		    int i = (low - 1);
		    
		    for (int j = low; j < high; j++) {
		      if (array[j] <= pivot) {
		        
		        i++;

		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		      }

		    }
		    int temp = array[i + 1];
		    array[i + 1] = array[high];
		    array[high] = temp;

		    return (i + 1);
		  }

		  static void quicksort(int array[], int low, int high) {
		    if (low < high) {

		    int pi = 0;
			try {
				pi = partition(array, low, high);
			} catch (Exception e) {
				e.printStackTrace();
			}
		      	    
		      quicksort(array, low, pi - 1);

		      quicksort(array, pi + 1, high);
		    }
		  }
		}

		
	class main{
		private static Quetion3_Array_Objects Quicksort;

		public static void main(String args[]) {

		    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
		    System.out.println("Unsorted Array");
		    System.out.println(Arrays.toString(data));

		    int size = data.length;
		    Quicksort.quicksort(data, 0, size - 1);

		    System.out.println("Sorted Array in Ascending Order ");
		    System.out.println(Arrays.toString(data));
		  }
		}
	


