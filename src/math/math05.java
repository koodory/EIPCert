package math;

import java.util.Scanner;

public class math05 {

	public static void main(String[] args) {
		System.out.println("< 소인수 분해 >");
		System.out.print("가장 큰 수 입력:");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A[] = new int [20];
		if (N < 2){
			System.out.println("입력오류");
		}
		int T = 0;

		while( N != 1){
			int P = 2;
			while(N % P !=0){ //어떤수로 나눠질때까지 증가, P가2로 나누어지면 P++은 실행안됨
				P++;
			}
			T++; //나누어 떨어지거나 모든 시행을 끝나면 T 증가
			A[T] = P; // 나누어 떨어지게 만드는 분자
			N = N/P; // 다시 식을 나눔
		}

		if(T == 1){
			System.out.println("소수");		 
		}else{
			for(int J=1; J<=T-1; J++){
				System.out.print(A[J]+"*");
			}
			System.out.println(A[T]);
		}
	}
}
