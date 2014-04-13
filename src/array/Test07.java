package array;

public class Test07 {

	static int S[][] = new int[5][5];
	static int R=0;
	static int C=2;
	static int NR;
	static int NC;
	public static void show(){
		System.out.printf("7.마방진\n\n");
		for(int x=0; x<5; x++){
			for(int y=0; y<5; y++){
				if(S[x][y] < 10)
					System.out.print(" ");
				System.out.print(S[x][y] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		for(int N=0; N<25; N++){
			S[R][C] = N+1;
			NR = R - 1; //다음행
			NC = C + 1; //다음열
			if(NR == -1){
				NR = 4;
			}
			if(NC == 5){
				NC = 0;
			}
			if(S[NR][NC]==0){
				R = NR;
				C = NC;
			}else{
				R=R+1;
			}
		}
		show();
	}
}