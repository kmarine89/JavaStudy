package pattern.G.chain_of_responsibility;

public class Casanova extends Expert {

	public Casanova() {
		this.expertName = "카사노바";
	}
	
	@Override
	protected boolean solve(Problem p) {
		if(p.getProblemName().contains("여자")) {
			System.out.println("★★ 난 카사노바, 여자를 죽였다.★★");
			return true;
		} else {
			System.out.println("★★ 난 카사노바, "+p.getProblemName()+"을 모른척 했다.★★");
			return false;
		}
	}
	
}
