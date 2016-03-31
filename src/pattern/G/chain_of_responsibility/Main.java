package pattern.G.chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		Problem[] problems = new Problem[5];
		problems[0] = new Problem("µ¢Ä¡ Å« ±øÆÐ");
		problems[1] = new Problem("ÄÄÇ»ÅÍ º¸¾ÈÀåÄ¡");
		problems[2] = new Problem("±îÄ¥ÇÑ ¿©ÀÚ");
		problems[3] = new Problem("³¯·ÆÇÑ ±øÆÐ");
		problems[4] = new Problem("ÆøÅº");
		
		Expert fighter = new Fighter();
		Expert hacker = new Hacker();
		Expert casanova = new Casanova();
		
		fighter.setNext(hacker).setNext(casanova);
		
		for (Problem problem : problems) {
			fighter.support(problem);
		}
	}
	
}
