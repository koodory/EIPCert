package dataStructure;

import java.util.Random;
import java.util.Scanner;

public class Section07 {
	private final static int SIZE = 10;
	private final static int MAX = 100;
	private static int[] array;
	private static int step = 0;
	private static int count = 0;
	private static Scanner scan = new Scanner(System.in);
	private static int input;

	private void binarySearch(int low, int high, int[] array) {
		int median; 
		step++;
		count++;
		if(low > high){
			System.out.println("No data were found");
		}else{
			median = (int)(low + high)/2;
			if(array[median] == input){
				printResult(array, true, step, median);
				return;
			}
			else if(array[median] > input){
				high = median - 1;
				printResult(array, false, step, median);
			}else{
				low = median + 1;
				printResult(array, false, step, median);
			}
			if(low <= high)
				binarySearch(low, high, array);
			else
        System.out.println("ERROR!");
		}
	}

	public void setUp() throws Exception {
		array = new int[SIZE];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(MAX);
		}
		Section06 list = new Section06();
		list.sort(array);
	}

	public void printLine(){
		for(int i=0; i<array.length; i++){
			System.out.print("----");
		}
		System.out.println("");
	}

	private void printResult(int[] array, boolean flag, int step, int median) {
		String tag = null;

		if(step ==0){
			tag = flag == false ? "Data : " : "Result : ";
			System.out.println(" ");
		}else if(step ==1){
			System.out.println("");
			printLine();
			System.out.print("[Index]  ");
			
			for(int i=0; i<array.length; i++){
				System.out.print(i + "  ");
			}
		System.out.println(" ");	
		 printLine();
			System.out.print("Step " + step + " : ");
		}else{
			tag = "Step " + step + " : ";
			System.out.print(tag);
		}

		for (int i = 0; i < array.length; i++) {
			if(median != -1 &&  i == median)
				System.out.print("("+array[i]+") ");
			else
				System.out.print(array[i] + " ");
		}
		System.out.println();

		if(tag == "Data : ")
			System.out.println(" ");
		else if(flag == true){
			printLine();
			System.out.println("Result:  Array[" + median+ "] = " + array[median]);
			System.out.println("Count : " + count);
		}
	}

	private void commandPrompt(){
		System.out.print("Input any number for search : ");
		input = scan.nextInt();
	}

	public static void main(String[] args) throws Exception{
		Section07 bs = new Section07();
		bs.setUp();
		bs.printResult(array, false, 0, -1);
		bs.commandPrompt();
		bs.binarySearch(0, array.length -1, array);
	}
}
