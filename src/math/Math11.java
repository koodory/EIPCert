package math;

import java.util.Scanner;

public class Math11 {
	private static Scanner scan = new Scanner(System.in);
	private static String[] H;
	private static String[] T;
	private static int D;
	private final static int NUMBER = 16;
	
	private static void promptCommand(){
		System.out.println("<<10진수와 16진수의 변환>>");
		System.out.printf("\n10진수 입력 : ");
		D = scan.nextInt();
	}

	private static void initArray(){
		for(int i=0; i<16; i++){
			if(i<10)
				H[i] = i+"";
			else
				H[i] = (char)('A'+i-10)+"";
		}
	}
	
	private static int hexaTrans(){
		int i=0, M, N;
		do{
			M = D/16;
			N = D % 16;
			T[i] = H[N];
			D = M;
			i++;
			if(M < 16){
				T[i] = H[M];
				break;
			}
		}while(true);
		
		return i;
	}
	
	private static void hexaShow(int i){
		int K = i;
		System.out.printf("\n--> 16진수 : ");
		do{
			System.out.print(T[K]);
			K--;
		}while(K >= 0);
	}
	
	public static void main(String[] args) {
		H = new String[NUMBER];
		T = new String[20];
		initArray();
		promptCommand();
		int i = hexaTrans();
		hexaShow(i);
	}
}



