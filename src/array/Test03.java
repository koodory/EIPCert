package array;

public class Test03 {

	static int A[][] = new int[5][5];
	static int V=1;
	static int R=0;
	static int C=0;
	static int M=3;
	public static void main(String[] args) {
		for(int R=0; R<M; R++){
			for(int C=R; C<5-R; C++){
				A[R][C] = V++;
			}
		}
		for(int R=M; R<5; R++){
			for(int C=4-R; C<R+1; C++){
				A[R][C] = V++;
			}
		}
		System.out.printf("3.모래시계 모양으로 배열 채우기\n\n");
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(A[i][j] < 10)
					System.out.print(" ");
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
