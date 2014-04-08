package math;

import java.util.Scanner;

public class Math14 {
	private static Scanner scan = new Scanner(System.in);
	static int[] P;
	static int PN = 0;
	static int E = 0;
	static boolean flag = true;
  static int len = 9;
  
	private static void promptCommand(){
		int count = 0;
		System.out.println("<<패리티 비트 검증>>");
		do{
			count = 0;
			System.out.printf("\n8비트값 입력 : ");
			String input = scan.nextLine();
			P = new int[len];
			flag = true;
			for(int i=0; i<len; i++){
				if(i== len-1)
					P[i] = Integer.parseInt(input.substring(i));
				else if(i<len-1 && i >= 0)
					P[i] = Integer.parseInt(input.substring(i,i+1));
				else{
					throw new RuntimeException("Range of index is invalid");
				}
				if(P[i] >=0 &&  P[i] <= 1){
					count++;
				}else{
					count = 0;
					flag = false;
				}
			}
			if(flag==true && count ==len)
				break;
			else
				System.out.println(">>0,1이외의 값을 넣었습니다.");
		}while(true);
	}

	private static void compare(){
		PN = 0;
		for(int K=1; K<=8; K++){
			if(P[K] == 1){
				PN++;
			}
		}
	}

	private static void showResult(){
		E = PN % 2;
		System.out.print("패리티 검사 : ");
		if(P[0] == E){
			System.out.print("오류 미발견");
		}else{
			System.out.print("오류 발견");
		}
	}

	public static void main(String[] args) {

		try{
			promptCommand();
			compare();
			showResult();
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
	}
}

