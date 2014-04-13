package array;

public class Test01 {

	static int A[][] = new int[5][5];
	static int V=0;
	public static void main(String[] args) {
		for(int C=0; C<5; C++){
			for(int R=0; R<5; R++){
				A[R][C] = ++V;
			}
		}
		System.out.printf("1.행우선/열 우선 배열 채우기\n\n");
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(A[i][j] < 10)
					System.out.print("0");
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
