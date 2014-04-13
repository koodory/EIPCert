package dataStructure;


public class Section08 {

	private static final int LENGTH  = 11;
	static int[][] node = new int[LENGTH][3];

	private void initData(){
		int[] Trunk= {10,7,2,4,15,18,12,9,20,13,1};
		int[] node_1 = {1,2,1,1,3,4,2,5,4,5,6};
		int[] node_2 = {2,4,4,3,4,5,5,6,6,7,7};

		for(int i=0; i<Trunk.length;i++){
			node[i][0] = Trunk[i];
			node[i][1] = node_1[i];
			node[i][2] = node_2[i];
		}
	}

	private void selectSort(){
		for(int i=0; i<node.length-1; i++){
			for(int j=i+1; j<node.length;j++){
				if(node[i][0] > node[j][0])
					swap(i,j);
			}
		}
	}

	private void swap(int i, int j){
		int[] temp = new int[3];
		for(int k=0; k<3; k++){
			temp[k] = node[i][k];
			node[i][k] = node[j][k];
			node[j][k] = temp[k];
		}
	}

	private boolean cycle(int index){
		int[] nodeList = new int[2*(index + 1)]; 
		for(int i=0; i<=index; i++){
			nodeList[2*i] = node[i][1]; 
			nodeList[2*i+1] = node[i][2];
		}
		System.out.println();
		for(int j:nodeList){
			System.out.print(j + " ");
		}
		//1) 이진트리 구성 
		//2) 새로운 값 입력시 L-R 비교하여 같은 값이 있으면 그 트리에 나머지값 연결
		//3) 일치되는 값이 없을 경우 새로운 이진트리 구성
		//4) 값 입력후 각각의 이진트리에서 중복 발생하는지 확인
		//5) 중복이 발생하면 순환 발생 --> return false
		//6) 중복이 없을 경우 순환 없음 --> return true;
		return false;
	}
	
	private void shortPathAlgorism(){
		int line = 1 , K = 0, weight = 0, N = 7;
		while(true){
			if(line <= N-1){
				if(cycle(K) == false){
					weight += node[K][0];
					System.out.println(K +"'s value : " + node[K][0]);
				}
				line++;
				K++;
			} else{
				System.out.println("final value : " + weight);
				return;
			}
		}
	}

	private void show(int num){
		for(int i=0; i<node.length; i++){
			System.out.printf(node[i][num] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		Section08 shortPath = new Section08();
		shortPath.initData();
		shortPath.selectSort();
		for(int i=0; i<3; i++){			
			shortPath.show(i);
		}
//		shortPath.shortPathAlgorism();
		System.out.println(shortPath.cycle(5));
	}
}
