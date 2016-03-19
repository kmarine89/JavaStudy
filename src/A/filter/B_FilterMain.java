package A.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class B_FilterMain {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		inventory.add(new Apple("green", 160));
		inventory.add(new Apple("red", 170));
		inventory.add(new Apple("green", 140));
		
		System.out.println("==== Green Filter ====");
		List<Apple> greenList = filterApples(inventory, a -> "green".equals(a.getColor()));
		for (Apple apple : greenList) {
			System.out.println(apple.toString());
		}
		
		System.out.println("==== Heavy Filter ====");
		List<Apple> heavyList = filterApples(inventory, a -> a.getWeight() > 150);
		for (Apple apple : heavyList) {
			System.out.println(apple.toString());
		}
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}