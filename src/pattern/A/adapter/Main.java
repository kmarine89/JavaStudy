package pattern.A.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Main {

	// 이 메서드는 아주 유용한 메서드 인데
	// 매개변수를 Enumeration로만 받음
	public static void goodMethod(Enumeration<String> enu) {
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("김양수");
		list.add("김경미");
		list.add("김형석");
		
		Enumeration<String> enu = new IteratorToEnumeration(list.iterator());
		goodMethod(enu);
	}

}
