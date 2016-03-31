package pattern.G.chain_of_responsibility;

public class Hacker extends Expert {

	public Hacker() {
		this.expertName = "해커";
	}

	@Override
	protected boolean solve(Problem p) {
		if(p.getProblemName().contains("컴퓨터")) {
			System.out.println("★★ 난 해커, 컴퓨터를 부셨다.★★");
			return true;
		} else {
			System.out.println("★★ 난 카사노바, "+p.getProblemName()+"을 모른척 했다.★★");
			return false;
		}
	}
}
