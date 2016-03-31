package pattern.H.facade;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		Audio audio = new Audio();
		Light light = new Light();
		
		Home home = new Home(audio, light, tv);
		
		home.enjoyTv();
		home.enjoyMusic();
		home.getOut();
	}
}
