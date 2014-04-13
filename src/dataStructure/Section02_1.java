package dataStructure;

public class Section02_1 {

	static int E[] = new int[100];
	static int TEMP;
	
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
	
	static public void SWAP(int i, int j){
		TEMP = E[i];
		E[i] = E[j];
		E[j] = TEMP;
	}
	
	public static void main(String[] args) {
	  init();
		System.out.println("선택정렬 + 스왑함수");
		for(int i=0;i<99;i++){
			for(int j=i+1;j<100;j++){
				if(E[i]>E[j]){
					SWAP(i,j);
				}
			}
		}
		show();
	}
}
