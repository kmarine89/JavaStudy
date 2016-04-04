package pattern.K.builder;

public class BatmanBilder implements Builder {

	private Hero batman;

	public BatmanBilder() {
		batman = new Hero("¹èÆ®¸Ç");
	}

	@Override
	public void makeArm() {
		batman.setArmSource("µ·Áö¶ö");
	}

	@Override
	public void makeLeg() {
		batman.setLegSource("µ·Áö¶ö");
	}

	@Override
	public Hero getResult() {
		return batman;
	}
}
