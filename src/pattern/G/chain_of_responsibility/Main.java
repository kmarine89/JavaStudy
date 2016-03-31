package pattern.G.chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		Problem[] problems = new Problem[5];
		problems[0] = new Problem("��ġ ū ����");
		problems[1] = new Problem("��ǻ�� ������ġ");
		problems[2] = new Problem("��ĥ�� ����");
		problems[3] = new Problem("������ ����");
		problems[4] = new Problem("��ź");
		
		Expert fighter = new Fighter();
		Expert hacker = new Hacker();
		Expert casanova = new Casanova();
		
		fighter.setNext(hacker).setNext(casanova);
		
		for (Problem problem : problems) {
			fighter.support(problem);
		}
	}
	
}
