package pattern.C.factory;

public class Main {

	public static void main(String[] args) {
		Animal a1 = AnimalFactory.create("소");
		Animal a2 = AnimalFactory.create("고양이");
		Animal a3 = AnimalFactory.create("개");
		a1.printDescription();
		a2.printDescription();
		a3.printDescription();
	}

}
