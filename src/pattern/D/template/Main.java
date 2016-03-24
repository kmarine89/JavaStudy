package pattern.D.template;

public class Main {

	public static void main(String[] args) {
		Worker designer = new Designer();
		Worker gamer = new Gamer();
		designer.work();
		gamer.work();
	}

}
