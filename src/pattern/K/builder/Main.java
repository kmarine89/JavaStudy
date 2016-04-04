package pattern.K.builder;

public class Main {

	public static void main(String[] args) {
		Builder builder = new BatmanBilder();
		Director director = new Director(builder);
		director.build();
		Hero hero = director.getHero();
		hero.showResult();
	}

}
