package A.filter;

import java.util.ArrayList;
import java.util.List;

public class A_FilterMain {

	/**
	 * Java8 람다 표현식이 포함되지 않은 필터 코드
	 * 소스코드가 길고 Case by Case의 메서드 구현임
	 */
	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		inventory.add(new Apple("green", 160));
		inventory.add(new Apple("red", 170));
		inventory.add(new Apple("green", 140));
		
		System.out.println("==== Green Filter ====");
		List<Apple> greenList = filterGreenApples(inventory);
		for (Apple apple : greenList) {
			System.out.println(apple.toString());
		}
		
		System.out.println("==== Heavy Filter ====");
		List<Apple> heavyList = filterHeavyApples(inventory);
		for (Apple apple : heavyList) {
			System.out.println(apple.toString());
		}
	}
	
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}

}