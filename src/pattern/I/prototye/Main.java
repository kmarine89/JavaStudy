package pattern.I.prototye;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Complex com = new Complex("�ſ� ������ �Ű�����(����)");
		try {
			Complex cloned1 = (Complex) com.clone();
			cloned1.setDate(new Date(2008,0,1));
			
			Complex cloned2 = (Complex) com.clone();
			cloned2.setDate(new Date(2008,2,1));
			
			System.out.println(cloned1.getDate());
			System.out.println(cloned2.getDate());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
