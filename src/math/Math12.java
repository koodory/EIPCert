package math;

import java.util.Scanner;

public class Math12 {
	private static Scanner scan = new Scanner(System.in);
	static int[] B = new int[4];
	static int[] E = new int[4];
	static byte[] A = new byte[4];
	static int C = 0;;
	static int S = 0;
	static boolean flag = true;
	
	private static void promptCommand(){
		int count = 0;
		System.out.println("<<BCD코드와 3초과 코드의 변환>>");
		do{
			count = 0;
			System.out.printf("\nBCD 코드 입력 : ");
			String input = scan.nextLine();
			flag = true;
			for(int i=0; i<4; i++){
				if(i== 3)
					B[i] = Integer.parseInt(input.substring(i));
				else if(i<3 && i >= 0)
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
		}while(flag!=true || count !=4 );
	}

	private static void initA(){
		A[0] = 0;	A[1] = 0; A[2] = 1; A[3] = 1;
	}
	
	private static void transform(){
		for(int K =4 ; K >=1; K--){
			S=B[K-1] + A[K-1] + C;
			if(S>1){
				E[K-1] = S % 2; //S가 2이면 --> 0
				C = 1;
			}else{
				E[K-1] = S;
				C= 0;
			}
		}
	}
	
	private static void showResult(){
		System.out.print("3초과 코드 : ");
		for(int K = 1 ; K <= 4; K++){
			System.out.print(E[K-1]);
		}
	}
	
	public static void main(String[] args) {
		
		try{
			promptCommand();
			initA();
		  transform();
		  showResult();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

