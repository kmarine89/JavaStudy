package pattern.J.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
	private static Map<String, Person> map = new HashMap<>();
	public synchronized static Person getPerson(String name) {
		if(!map.containsKey(name)) {
			Person tmp = new Person(name);
			map.put(name, tmp);
		}
		return map.get(name);
	}
	
	public static class Person {
		private final String name;
		private Person(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	}
}
