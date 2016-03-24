package pattern.D.template;

public abstract class Worker {

	protected abstract void doit();
	
	public final void work() {
		System.out.println("���");
		doit();
		System.out.println("���");
	}
	
}
