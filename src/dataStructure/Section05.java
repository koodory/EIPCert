package dataStructure;

public class Section05 {

	static int A[] = new int[1000];
	static int B[] = new int[1000];
	static int C[] = new int[2000];
	static int count;
	static public void init(){
		for(int i=0; i < 1000; i++){
			A[i] = 2*i;
		  B[i] = 2000 - (1 + 2*i);	
		}
	}

	static public void show(){
		for(int i=0; i < C.length; i++){
			System.out.println(" C[" +i + "] = " + C[i]);
		}
		System.out.println(count);
	}


	public static void main(String[] args) {
		init();
		System.out.println("병합정렬");
		int iA = 0 , iB = A.length -1, iC = 0, M = 1000;
		int Done = 0;
		while(iB >=0){
			count++;
			if(A[iA] < B[iB]){
				C[iC] = A[iA]; //B가 클경우 C에 A를 저장
				iA++;
				iC++;
				if(iA >= M){ // iA가 length까지 도달하면
					if(Done == 0){ // 한쪽만 끝날경우
						A[M-1] = 999999;
						iA = M-1;
						Done = 1;
					}else{ //두 쪽다 끝날 경우
						show();
						break;
					}
				}
			}else{
				C[iC] = B[iB]; // A가 클경우 C에 B를 저장
				iB--;
				iC++;
				if(iB<0){
					if(Done ==0){
						B[0] = 999999;
						iB = 1;
						Done = 1;
					}else{
						show();
						break;
					}
				}
			}
		}
	}
}
