package array;

public class Test06 {

	static int A[][] = new int[5][5];
	static int V=1;
	static int D=1;
	static int C1=0;
	static int C2=4;
	static int Temp;
	static int flag = 0;
	public static void show(){
		System.out.printf("6.ㄹ모양으로 배열 채우기\n\n");
		for(int x=0; x<5; x++){
			for(int y=0; y<5; y++){
				if(A[x][y] < 10)
					System.out.print(" ");
				System.out.print(A[x][y] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		for(int R=0; R<5; R++){
			if(C1<C2){
				for(int C=C1;  C <= C2 ; C=C+D){
					A[R][C] = V;
					V++;
				}
			}else{
				for(int C=C1;  C >= C2 ; C=C+D){
					A[R][C] = V;
					V++;
				}
			}
			Temp = C1;
			C1 = C2;
			C2 = Temp;
			D = -D;
		}
		show();
	}
}