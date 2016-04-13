package datastructure.A.higharray;

public class HighArray {

	private int[] data;
	private int eElems = 0;
	
	public HighArray(int maxSize) {
		data = new int[maxSize];
	}
	
	public boolean find(int searchValue) {
		for (int i = 0; i < eElems; i++) {
			if(data[i] == searchValue) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(int insertValue) {
		if(eElems < data.length)
			data[eElems++] = insertValue;
	}
	
	public void delete(int deleteValue) {
		for (int i = 0; i < eElems; ) {
			if(data[i] == deleteValue) {
				for (int j = i; j < eElems; j++) {
					data[j] = data[j+1];
				}
				eElems--;
				i = 0;
			} else {
				i++;
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < eElems; i++) {
			System.out.print(data[i]+"\t");
		}
		System.out.println();
	}
	
}
