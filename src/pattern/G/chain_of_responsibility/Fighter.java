package pattern.G.chain_of_responsibility;

public class Fighter extends Expert {
	
	public Fighter() {
		this.expertName = "격투가";
	}
	@Override
	protected boolean solve(Problem p) {
		if(p.getProblemName().contains("깡패")) {
			System.out.println("★★ 난 격투가, 깡패를 팼다.★★");
			return true;
		} else {
			System.out.println("★★ 난 격투가, "+p.getProblemName()+"을 모른척 했다.★★");
			return false;
		}
	}
}
