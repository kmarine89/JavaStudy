package algorithm.A;

public class Euclid {

	/*
	 * GCD 법칙...
	 * GCD(u, v) = GCD(u-v, v) , if u > v
	 * GCD(u, v) = GCD(v, u)
	 * GCD(u, 0) = u
	 * 
	 * 결국은
	 * GCD(u, v) = GCD(u%v, v) = GCD(v, u%v)
	 */
	public static void main(String[] args) {
		int u = 864;
		int v = 32;
		System.out.println(gcd_module(u, v));
		System.out.println(gcd_recursion(u, v));
	}

	// 일반적인 방법
	static int gcd_module(int u, int v) {
		int temp;
		while(v != 0) {
			temp = u % v;
			u = v;
			v = temp;
		}
		return u;
	}
	
	// 재귀함수를 이용한 방법
	static int gcd_recursion(int u, int v) {
		if(v == 0) 
			return u;
		else
			return gcd_recursion(v, u%v);
	}
	
}
