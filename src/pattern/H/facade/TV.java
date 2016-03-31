package pattern.H.facade;

public class TV {
	private boolean turnedOn = false;
	public void turnOn() {
		turnedOn = true;
		System.out.println("TV�� ��.");
	}
	public void turnOff() {
		turnedOn = false;
		System.out.println("TV�� ��.");
	}
	public boolean isTurnedOn() {
		return turnedOn;
	}
}
