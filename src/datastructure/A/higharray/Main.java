package datastructure.A.higharray;

public class Main {

	public static void main(String[] args) {
		HighArray array = new HighArray(10);
		array.insert(10);
		array.insert(20);
		array.insert(30);
		array.insert(40);
		array.insert(10);
		array.display();	// 출력
		
		array.delete(10);
		array.display();	// 출력
	}
	
}
