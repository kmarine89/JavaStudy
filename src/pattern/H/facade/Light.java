package pattern.H.facade;

public class Light {
	private int lightness = 0;
	public int getLightness() {
		return lightness;
	}
	public void setLightness(int lightness) {
		System.out.println("��⸦ " + lightness+"�� ����");
		this.lightness = lightness;
	}
}
