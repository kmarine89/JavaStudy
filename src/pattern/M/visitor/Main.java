package pattern.M.visitor;

public class Main {

	public static void main(String[] args) {
		Composite main = createComposite();
		YadongFinder visitor = new YadongFinder();
		visitor.visit(main);
		for (String string : visitor.getYadongList()) {
			System.out.println(string);
		}
	}

	private static Composite createComposite() {
		Composite main = new Composite("C:");
		Composite sub1 = new Composite("Program Files");
		Composite sub2 = new Composite("WINDOWS");
		Composite sub11 = new Composite("Pruna");
		Composite sub21 = new Composite("system32");
		Composite sub111 = new Composite("Incoming");
		
		Leaf leaf1111 = new Leaf("Best Good.avi");
		Leaf leaf1112 = new Leaf("Worst.avi");
		Leaf leaf211 = new Leaf("이게진리.avi");
		Leaf leaf212 = new Leaf("작년 여름 누구와 함께.jpg");
		
		main.add(sub1);
		main.add(sub2);
		sub1.add(sub11);
		sub2.add(sub21);
		sub11.add(sub111);
		
		sub111.add(leaf1111);
		sub111.add(leaf1112);
		sub21.add(leaf211);
		sub21.add(leaf212);
		
		return main;
	}

}
