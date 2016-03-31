package pattern.G.chain_of_responsibility;

public class Fighter extends Expert {
	
	public Fighter() {
		this.expertName = "������";
	}
	@Override
	protected boolean solve(Problem p) {
		if(p.getProblemName().contains("����")) {
			System.out.println("�ڡ� �� ������, ���и� �״�.�ڡ�");
			return true;
		} else {
			System.out.println("�ڡ� �� ������, "+p.getProblemName()+"�� ��ô �ߴ�.�ڡ�");
			return false;
		}
	}
}
