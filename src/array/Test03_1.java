package array;

public class Test03_1 {

	static int A[][] = new int[5][5];
	static int V=1;
	static int R=0;
	static int C=0;
	static int M=3;
	public static void main(String[] args) {
		for(int R=0; R<5; R++){
			for(int C=0; C<5; C++){
				if(C>=R && C < 5-R)
				  A[R][C] = V++;
				if(C <= R  && R > 2 && C > 3-R)
					A[R][C] = V++;
			}
		}
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
