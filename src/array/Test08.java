package array;

public class Test08 {

	static char A[][] = new char[5][5];
	static char B[][] = new char[5][5];
	static int N;
	static int cnt = 65; //A
	public static void show(){
		System.out.printf("8.배열회전\n\n");
		for(int x=0; x<5; x++){
			for(int y=0; y<5; y++){
				System.out.print(B[x][y] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		for(int R=0; R<5; R++){ 
			for(int C=0; C<5; C++){
				A[R][C] = (char)cnt++;
				N = 4 - R;
				B[C][N] = A[R][C];
			}
		}
		show();
	}
}