package math;

import java.util.Scanner;

public class Math08 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("<< 최대공약수와 최소공배수>>");
		System.out.printf("\n첫번째 수 : ");
		int X = scan.nextInt();
		System.out.print("두번째 수 : ");
		int Y = scan.nextInt();
		final int N1 = X;
		final int N2 = Y;

		while(true){
			if(X < Y){ // X를 Y로 나누어야 하기 떄문에 X가 항상 커야함
				int TEMP = X; // 치환 
				X = Y;
				Y = TEMP;
			}
			int M = X % Y; //나머지 구하기
			if(M == 0){
				System.out.println("--------------------------");
				System.out.println("최대공약수 : " + Y);
				int LGC = (N1 * N2) / Y;
				System.out.println("최소공배수 : " + LGC);
				break;
			}else{ //나머지가 0이 아닐 경우
				X = Y;   // 작은수를 대입
				Y = M; // 그 나머지를 대입.. 이것이 반복되면 최대공약수로 수렴
			}
		}
	}

}
