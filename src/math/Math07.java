package math;

import java.util.Scanner;

public class Math07 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int TN = 0;
		System.out.println("<< 완전수 구하기 >>");
		System.out.print("처음 숫자 : ");
		int FIRST = scan.nextInt();
		System.out.print("마지막 숫자 : ");
		int LAST = scan.nextInt();
		
		for(int N = FIRST; N <= LAST; N++){
			int SUM = 0;
			int K = (int)(N/2); //약수는 한 짝은 원래수의 1/2를 못넘음
			for(int J=1; J<=K; J++){
				int R = N % J; // 특정수에 나누어 떨어질 떄
				if( R == 0)
					SUM += J; // 나눈수를 누적
			}
      if(N == SUM){ // 약수와 그 총합이 같다면
      	if(TN == 0){
      		System.out.printf("\n{%d",N);
      	}else{
      	System.out.print("," + N);
      	}
        TN++;
      }
		}
		System.out.print("}");
		System.out.println("\n완전수의 개수 : " + TN );
	}

}
