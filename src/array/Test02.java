package array;

public class Test02 {

	static int A[][] = new int[5][5];
	static int V=1;
	static int R=0;
	static int C=0;
	public static void main(String[] args) {
		do{
			C=R;
			do{
				A[R][C]=V;
				V++;
				C++;
			}while(!(C > 4));
			R++;
		}while(!(R > 4));
		System.out.printf("2.삼각형 모양으로 배열 채우기\n\n");
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(A[i][j] < 10)
					System.out.print(" ");
				if(i<=j)
				System.out.print(A[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}
