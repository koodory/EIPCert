package math;

public class Math06 {

	public static void main(String[] args) {
		System.out.println("<배수와 공배수>");
		int[] A = { 21,17,4,51,24,75,40,27,48,72};
		int[] num = new int[10];
		int CNT = 0, i = 0;
		do
		{
			int N3 = A[i]%3;
			int N4 = A[i]%4;
			int N = N3 + N4;
			if(N == 0){
				num[CNT] = A[i];
				if(CNT == 0)
					System.out.print("{" + num[CNT]);
				else
					System.out.print(" , " + num[CNT]);
				CNT++;
			}
			i++;
		}while(i<10);
		System.out.print("}");
		System.out.printf("\n3 * 4의 배수 : %d개",CNT);
	}
}
