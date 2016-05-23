package algorithm.A;

public class PrimeNumber {

	/*
	 * N ���� ���� �Ҽ��� ��� ���Ͽ� ���
	 */
	public static void main(String[] args) {
		int N = 10000000;
		boolean[] arr = new boolean[N+1];
		for (int i = 2; i < arr.length; i++) {
			if(arr[i])
				continue;
			int num = i;
			while((num += i) < arr.length) {
				arr[num] = true;
			}
		}
		// �Ҽ� ���
		for (int i = 2; i < arr.length; i++) {
			if(!arr[i])
				System.out.println(i + "\t");
		}
	}

}
