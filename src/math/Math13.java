package math;

import java.util.Scanner;

public class Math13 {
	private static Scanner scan = new Scanner(System.in);
	static int[] B;
	static int[] O;
	static int[] T;
	static int N = 0;;
	static int C = 0;
	static boolean flag = true;

	private static void promptCommand(){
		int count = 0;
		System.out.println("<<2의 보수 구하기>>");
		do{
			count = 0;
			System.out.printf("\n2진수 값 입력 : ");
			String input = scan.nextLine();
			int len = input.length();
			N = len;
			B = new int[len];
			O = new int[len];
			T = new int[len];
			flag = true;
		  int temp = binTrans(len,count,input);
			if(flag==true && temp ==len)
				break;
		}while(true);
	}

	private static int binTrans(int len, int count, String input){
		for(int i=0; i<len; i++){
			if(i== len-1)
				B[i] = Integer.parseInt(input.substring(i));
			else if(i<len-1 && i >= 0)
				B[i] = Integer.parseInt(input.substring(i,i+1));
			else{
				throw new RuntimeException("Range of index is invalid");
			}
			if(B[i] >=0 &&  B[i] <= 1){
				count++;
			}else{
				count = 0;
				flag = false;
			}
		}
		return count;
	}
	
	private static void reverse(int i){
		do{
			O[i] = 1 - B[i];
			i++;
		}while(i < N);	
	}
	
	private static void complement(int i){
		do{
			T[i] = 1;
			if(O[i] == C)
				T[i] = 0;
			C = O[i] * C;
			i = i -1;
		}while(i>=0);
	}
	
	private static void transform(){
		int i = 0;
		do{
			O[i] = 1 - B[i];
			i++;
		}while(i < N);
		i = N-1;
		C = 1;
		
		do{
			T[i] = 1;
			if(O[i] == C)
				T[i] = 0;
			C = O[i] * C;
			i = i -1;
		}while(i>=0);
		reverse(i);
		i = N-1;
		C = 1;
		complement(i);
	}
	
	private static void showResult(){
		System.out.print("2의보수 : ");
		for(int i=0; i<N; i++){
			System.out.print(T[i]);
		}
	}

	public static void main(String[] args) {

		try{
			promptCommand();
			transform();
			showResult();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

