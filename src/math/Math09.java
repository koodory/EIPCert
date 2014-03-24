package math;

import java.util.Scanner;

public class Math09 {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("<< 근사값>>");
		System.out.print("100미만의 수 입력 : ");
		final int Ans = scan.nextInt();
		int[] A = { 0,31,25,53,34,12,67,15,94,49};
		int MinCha = 100, Cha = 0; //최소차는 구간 최대값으로, 차는 0으로 초기화
		int N = 0 , value =0;
		do{
			if(N == 0)
				System.out.printf("\n{%d",A[N]);
			else
				System.out.print("," + A[N]);
			
			if(A[N] >= Ans) //입력값 보다 클때
				Cha = A[N] - Ans; //차는 뺸다
			else
				Cha = Ans - A[N];//역으로
			
			if(Cha < MinCha){ //현재 차가 최소차보다 작으면
				MinCha = Cha; // 갱신
				value = A[N]; //값 저장
			}
			N++;
		}while(N<10);
		System.out.printf("}\n");
		System.out.println("가장 근접한 수: "+ value);
	}

}
