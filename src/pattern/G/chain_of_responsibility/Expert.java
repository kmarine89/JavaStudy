package pattern.G.chain_of_responsibility;

public abstract class Expert {
	private Expert next;
	protected String expertName;
	public final void support(Problem p) {
		if(solve(p)) {
			System.out.println(expertName+"�� "+p.getProblemName()+"�� �ذ��Ͽ���.");
		} else {
			if(next != null) {
				next.support(p);
			} else {
				System.out.println(p.getProblemName()+"�� �ذ��� �� ����.");
			}
		}
	}
	public Expert setNext(Expert next) {
		this.next = next;
		return next;
	}
	protected abstract boolean solve(Problem p);
}
