package algorithm.A;

public class PrimeNumber {

	/*
	 * N 보다 작은 소수를 모두 구하여 출력
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
		// 소수 출력
		for (int i = 2; i < arr.length; i++) {
			if(!arr[i])
				System.out.println(i + "\t");
		}
	}

}
