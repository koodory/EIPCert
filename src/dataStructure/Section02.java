package dataStructure;

public class Section02 {

	static int E[] = new int[100];

	static public void init(){
		for(int i=0; i < E.length; i++){
			E[i] = (int) (Math.random()*101);
		}
	}
	
	static public void show(){
		for(int i=0; i < E.length; i++){
			System.out.println(i + "  " + E[i]);
		}
	}
	
	
	public static void main(String[] args) {
		init();
		System.out.println("선택정렬");
		int i=0, TEMP;
		do{
			int j = i+1; // 현재 인덱스 i를 제외한 모든 수 비교
			do{
			if(E[i] > E[j]){
				TEMP = E[i];
				E[i] = E[j];
				E[j] = TEMP;
			}
			j = j+1;
			}while(!(j>99));
			i=i+1;
		}while(!(i>98));
		show();
	}
}
