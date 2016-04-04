package pattern.K.builder;

public class BatmanBilder implements Builder {

	private Hero batman;

	public BatmanBilder() {
		batman = new Hero("��Ʈ��");
	}

	@Override
	public void makeArm() {
		batman.setArmSource("������");
	}

	@Override
	public void makeLeg() {
		batman.setLegSource("������");
	}

	@Override
	public Hero getResult() {
		return batman;
	}
}
