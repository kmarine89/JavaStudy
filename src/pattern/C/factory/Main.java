package pattern.C.factory;

public class Main {

	public static void main(String[] args) {
		Animal a1 = AnimalFactory.create("��");
		Animal a2 = AnimalFactory.create("�����");
		Animal a3 = AnimalFactory.create("��");
		a1.printDescription();
		a2.printDescription();
		a3.printDescription();
	}

}
