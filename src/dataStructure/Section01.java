package dataStructure;

class Data{
	String name;
  int sales; 
  
	public Data(String name, int sales) {
	 this.name = name;
	 this.sales = sales;
  }
}

public class Section01 {

	public static void main(String[] args) {
		Data[] A = new Data[25];
		int R[] = new int[25];
		
		System.out.println("석차구하기");
		for(int i=0; i<25; i++){
		  A[i]= new Data("Agent"+i, (int) (1000 + Math.random() * 10000));
			R[i] = 1;
		}
						
		for(int i=0; i<25; i++){
			for(int j=0; j<25; j++){
				if(A[i].sales <= A[j].sales){
					R[i] = R[i] + 1;
				}
			}
		}
		
		for(int i=0; i<25; i++){
		System.out.println(A[i].name + " , " + R[i]);	
		}
	}
}