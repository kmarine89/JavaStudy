package pattern.A.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Main {

	// �� �޼���� ���� ������ �޼��� �ε�
	// �Ű������� Enumeration�θ� ����
	public static void goodMethod(Enumeration<String> enu) {
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		
		Enumeration<String> enu = new IteratorToEnumeration(list.iterator());
		goodMethod(enu);
	}

}
