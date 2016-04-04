package pattern.K.builder;

public class Hero {

	private String armSource;
	private String legSource;
	private String name;
	
	public Hero(String name) {
		this.name = name;
	}

	public void setArmSource(String armSource) {
		this.armSource = armSource;
	}

	public void setLegSource(String legSource) {
		this.legSource = legSource;
	}
	
	public void showResult() {
		System.out.println(armSource+"�� ���� �Ȱ� "+legSource+"�� ���� �ٸ��� ���� "+name);
	}
	
}
