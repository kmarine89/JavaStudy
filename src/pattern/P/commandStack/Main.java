package pattern.P.commandStack;

public class Main {

	public static void main(String[] args) {
		Panel panel = new Panel();
		CommandStack cs = new CommandStack();
		cs.execute(new PanelChangeCommand(panel, "��Ȳ"));
		cs.execute(new PanelChangeCommand(panel, "���"));
		cs.execute(new PanelChangeCommand(panel, "�ʷ�"));
		
		System.out.println("--undo 2��--");
		cs.undo();
		cs.undo();
		System.out.println("--redo 1��--");
		cs.redo();
		cs.execute(new PanelChangeCommand(panel, "�Ķ�"));
	}

}
