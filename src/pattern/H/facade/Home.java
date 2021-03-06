package pattern.H.facade;

public class Home {
	private Audio audio;
	private Light light;
	private TV tv;
	public Home(Audio audio, Light light, TV tv) {
		this.audio = audio;
		this.light = light;
		this.tv = tv;
	}
	public void enjoyTv() {
		System.out.println("== ���� ����ϰ� TV ����.");
		light.setLightness(2);
		tv.turnOn();
	}
	public void enjoyMusic() {
		System.out.println("==���� �ణ ��Ӱ��ϰ� ���ǵ��.");
		light.setLightness(1);
		audio.play();
	}
	public void getOut() {
		System.out.println("==TV����, ���ǵ� ����, �ҵ� ���� �����ϱ�");
		if(tv.isTurnedOn())
			tv.turnOff();
		if(audio.isPlaying())
			audio.stop();
		light.setLightness(0);
	}
}
