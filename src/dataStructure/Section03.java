package dataStructure;

public class Section03 {

	static int E[] = new int[100];
	static int KEY;

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
		System.out.println("버블정렬");
		int i=1;
		do{
			KEY = E[i];
			int j = i-1;
			do{
				if(E[j]>KEY){
					E[j+1] = E[j];
					j = j-1;
				}else{
					break;
				}
			}while(!(j<0));
			E[j+1] = KEY;
			i = i+1;
		}while(!(i>99));
		show();
	}
}
