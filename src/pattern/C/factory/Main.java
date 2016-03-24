package pattern.C.factory;

public class Main {

	public static void main(String[] args) {
		Animal a1 = AnimalFactory.create("pattern.C.factory.Cow");
		Animal a2 = AnimalFactory.create("pattern.C.factory.Cat");
		Animal a3 = AnimalFactory.create("pattern.C.factory.Dog");
		a1.printDescription();
		a2.printDescription();
		a3.printDescription();
	}

}
