package dataStructure;

import java.util.Random;

public class Section06 {
	private final static int SIZE = 10;
	private final static int MAX = 100;
	private static int[] array;
	private int size;
	private static int step;
	private static int count = 0;

	public void sort(int[] values) {
		if (values.length < 2){ 
			return;
		}
		Section06.array = values;
		size = values.length - 1;
		quickSort(0, size); 
	}

	private void quickSort(int low, int high) {
		int i = low, j = high;
		count++;
		step++;
		int pivot = array[low + (high-low)/2]; //median value

		while (i <= j) { // intersection point 
//			count++;
			while (array[i] < pivot) {
				i++; 
			}
			while (array[j] > pivot) {
				j--; 
			}

			if (i <= j) {
				swap(i, j);
				count++;
				i++;
				j--;
			}
		}
		
    this.printResult(array, false, step, pivot);
		// Recursion
		if (low < j) // Constraint for L-Value(-->)
			quickSort(low, j);
		if (i < high)
			quickSort(i, high); // Constraint for R-Value(<--)
	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public void setUp() throws Exception {
		array = new int[SIZE];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(MAX);
		}
	}

	private void printResult(int[] array, boolean flag, int step, int pivot) {
		String tag = null;
		
		if(step ==0){
		  tag = flag == false ? "Before : " : "After : ";
		   System.out.println(" ");
		}else{
		 tag = "Step " + step + " : ";
		}
		
		System.out.print(tag);
		
		for (int i = 0; i < array.length; i++) {
			if(pivot != -1 && array[i]  == pivot){
				System.out.print("("+pivot + ") ");
			}else{
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		
		if(tag == "Before : ")
			System.out.println(" ");
	}
	
	public static void main(String[] args) throws Exception{
		Section06 quickSort = new Section06();
		quickSort.setUp();
		quickSort.printResult(array, false,0, -1);
		quickSort.sort(array);	
		quickSort.printResult(array, true,0, -1);
		System.out.println("Count : " + count);
	}
}
