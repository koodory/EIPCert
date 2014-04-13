package dataStructure;

public class Section04 {

	static int E[] = new int[100];
	static int count;
	
	static public void init(){
		for(int i=0; i < E.length; i++){
			E[i] = (int) (Math.random()*101);
		}
	}
	
	static public void show(){
		for(int i=0; i < E.length; i++){
			System.out.println(i + "  " + E[i]);
		}
		System.out.println(count);
	}
	
	static public void swap(int j){
		int TEMP;
		TEMP = E[j];
		E[j] = E[j+1];
		E[j+1] = TEMP;
	}
	
	public static void main(String[] args) {
		init();
		System.out.println("삽입정렬");
		int i=0;
		do{
			count++;
			int j = 0; 
			do{
			if(E[j] > E[j+1]){
				swap(j);
			}
			j = j+1;
			}while(!(j>98-i));
			i=i+1;
		}while(!(i>98));
		show();
	}
}
