package array;

public class Test09 {

	static int A[][] = new int[2][4];
	static int B[][] = new int[4][3];
	static int S[][] = new int[2][3];
	static int N;
	static int cnt = 65; //A
	public static void init(){
		A[0][0] = 5; A[0][1] = 7; A[0][2] = -3; A[0][3] = 4;
		A[1][0] = 2; A[1][1] = -5; A[1][2] = 3; A[1][3] = 6;
		B[0][0] = 3; B[0][1] = 0; B[0][2] = 8;
		B[1][0] = -5; B[1][1] = 1; B[1][2] = -1;
		B[2][0] = 7; B[2][1] = 4; B[2][2] = 4;
		B[3][0] = 2; B[3][1] = 4; B[3][2] = 3;
	}
	
	public static void show(){
		System.out.printf("9.행렬곱셈\n\n");
		for(int x=0; x<2; x++){
			for(int y=0; y<3; y++){
				System.out.print(S[x][y] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		init();
		for(int R=0; R<2; R++){
			for(int C=0; C<3; C++){
				S[R][C] = 0;
				for(int K=0; K<4; K++){
					S[R][C] = S[R][C] + A[R][K] * B[K][C];
				}
			}
		}
		show();
	}
}