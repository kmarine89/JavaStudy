package pattern.P.commandStack;

public class Panel {
	private String color = "����";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println(this.color+"���� "+color+"�� ���� �ٲ�.");
		this.color = color;
	}
}
