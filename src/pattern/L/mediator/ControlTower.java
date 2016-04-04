package pattern.L.mediator;

public class ControlTower {

	private volatile boolean inUse;
	
	public synchronized boolean getPermission() {
		if(inUse) {
			return false;
		} else {
			inUse = true;
			return true;
		}
	}
	
	public void land(Airplane airplane) throws InterruptedException {
		int seq = airplane.getSeq();
		System.out.println(seq+"¹ø ºñÇà±â Âø·ú ½ÃÀÛ");
		Thread.sleep(1000);
		System.out.println(seq+"¹ø ºñÇà±â Âø·ú ³¡");
		inUse = false;
	}
	
}
