package array;

public class Test05{

	static int A[][] = new int[5][5];
	static int V=1;
	static int M=2;//(3-1): 인덱스 조정
	static int CL=M; //LeftEnd
	static int CR=M; //RightEnd

	public static void show(){
		System.out.printf("5.마름모 모양으로 배열 채우기\n\n");
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
			for(int C=CL; C<=CR; C++){
				A[R][C] = V;
				V += 2;
			}
			if(R<M){
				CL--;
				CR++;
			}else{
				CL++;
				CR--;
			}
		}
		show();
	}
}
