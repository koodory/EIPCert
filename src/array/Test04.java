package array;

public class Test04 {

	static int A[][] = new int[5][5];
	static int N=0;
	static int S=1;
	static int i=0;
	static int j=-1;
	static int K=5;
	
	public static void show(){
		System.out.printf("4. 달팽이 모양으로 배열 채우기\n\n");
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
		do{
			for(int P=0; P<K; P++){
				N++;
				j +=S;
				A[i][j] = N;
			}
			K=K-1; //첫 시행을 빼고 행,열을 주기적으로 -1씩 감소시킴
			if(K>0){
				for(int P=0; P<K; P++){
					N++;
					i += S;
					A[i][j] = N;
				}
				S *= -1; // 행,열 한번 반복후 주기적으로 행,열 증/감을 반복함
			}else{
				break;
			}
		}while(true);
    
   show();
	}
}
