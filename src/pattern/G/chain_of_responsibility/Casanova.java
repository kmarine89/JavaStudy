package pattern.G.chain_of_responsibility;

public class Casanova extends Expert {

	public Casanova() {
		this.expertName = "ī����";
	}
	
	@Override
	protected boolean solve(Problem p) {
		if(p.getProblemName().contains("����")) {
			System.out.println("�ڡ� �� ī����, ���ڸ� �׿���.�ڡ�");
			return true;
		} else {
			System.out.println("�ڡ� �� ī����, "+p.getProblemName()+"�� ��ô �ߴ�.�ڡ�");
			return false;
		}
	}
	
}
