package pattern.L.mediator;

public class Airplane extends Thread {

	private final ControlTower tower;
	private final int seq;
	
	public Airplane(ControlTower tower, int seq) {
		this.tower = tower;
		this.seq = seq;
	}

	public int getSeq() {
		return seq;
	}
	
	@Override
	public void run() {
		try {
			while(!tower.getPermission()) {
//				System.out.println(seq+"번 비행기 대기 중");
				Thread.sleep(10);
			}
			tower.land(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
