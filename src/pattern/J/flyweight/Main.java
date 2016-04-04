package pattern.J.flyweight;

import pattern.J.flyweight.PersonFactory.Person;

public class Main {
	public static void main(String[] args) {
		Person p1 = PersonFactory.getPerson("ȫ�浿");
		Person p2 = PersonFactory.getPerson("����");
		Person p3 = PersonFactory.getPerson("ȫ�浿");
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
	}
}
