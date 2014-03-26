package math;

import java.util.Scanner;

public class Math10 {
	private static Scanner scan = new Scanner(System.in);
	private static String temp;
	private static int[] T;
	private static int[] C;
	private final static int NUMBER = 8;
	private static int D = 0;
	private static int B = 1;

	private static void promptCommand(){
		System.out.printf("\n2진수 입력 : ");
		temp = scan.nextLine();
	}

	private static void binaryShow(){
		System.out.printf("\n--> ");
		for(int v:T){
			System.out.print(v);
		}
	}

	private static void positiveValue(int SIGN){
		for(int K=2; K <= 8; K++){
			int T1 = (int) Math.pow(2, 8-K); //자리수에 따라서 제승처리
			int T2 = T[K-1] * T1; //배열 * 제승
			D += T2;
		}
		D *= SIGN;
		binaryShow();
		System.out.print("를 10진수 변환 : " + D);
	}

	private static void negativeValue(int SIGN){
		SIGN = -1;

		for(int K=8; K >=2; K--){
			C[K-1] = T[K-1] - B;
			if(T[K-1] ==0 && B == 1 ){
				//명령식 없음 
			}else{
				B = 0;
			}
			T[K-1] = 1 - Math.abs(C[K-1]); //-1이므로 절대값 처리
		}
		positiveValue(SIGN);
	}

	public static void main(String[] args) {
		System.out.println("<<10진수와 2진수의 변환>>");
		T = new int[NUMBER];
		C = new int[NUMBER];

		promptCommand();
		for(int i=0; i<NUMBER; ){
			T[i] = Integer.parseInt(temp.substring(i,i+1));
			if(T[i] == 1 || T[i] == 0){
				i++;
			}else{
				System.out.println("다시 입력하세요!");
				i =0;
				promptCommand();
			}
		}
		int SIGN = 1;
		if(T[0] == 0){
			positiveValue(SIGN);
		}else{
			negativeValue(SIGN);
		}
	}
}



