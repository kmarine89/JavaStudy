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
		System.out.println(seq+"�� ����� ���� ����");
		Thread.sleep(1000);
		System.out.println(seq+"�� ����� ���� ��");
		inUse = false;
	}
	
}
