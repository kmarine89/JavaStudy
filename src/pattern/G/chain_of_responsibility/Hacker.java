package pattern.G.chain_of_responsibility;

public class Hacker extends Expert {

	public Hacker() {
		this.expertName = "��Ŀ";
	}

	@Override
	protected boolean solve(Problem p) {
		if(p.getProblemName().contains("��ǻ��")) {
			System.out.println("�ڡ� �� ��Ŀ, ��ǻ�͸� �μ̴�.�ڡ�");
			return true;
		} else {
			System.out.println("�ڡ� �� ī����, "+p.getProblemName()+"�� ��ô �ߴ�.�ڡ�");
			return false;
		}
	}
}
