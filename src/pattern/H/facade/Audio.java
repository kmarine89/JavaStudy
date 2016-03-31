package pattern.H.facade;

public class Audio {
	private boolean playing = false;
	public void play() {
		playing = true;
		System.out.println("������ ����.");
	}
	public void stop() {
		playing = false;
		System.out.println("������ ����.");
	}
	public boolean isPlaying() {
		return playing;
	}
}
