package pattern.J.flyweight;

import pattern.J.flyweight.PersonFactory.Person;

public class Main {
	public static void main(String[] args) {
		Person p1 = PersonFactory.getPerson("È«±æµ¿");
		Person p2 = PersonFactory.getPerson("±è¾ç¼ö");
		Person p3 = PersonFactory.getPerson("È«±æµ¿");
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
	}
}
