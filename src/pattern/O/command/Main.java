package pattern.O.command;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Command> cmds = new ArrayList<Command>();
		
		cmds.add(new Command() {
			@Override
			public void execute() {
				System.out.println("���� ��~");
			}
		});
		
		cmds.add(new Command() {
			@Override
			public void execute() {
				System.out.println("����̳� ����..");
			}
		});
		
		for (Command command : cmds) {
			command.execute();
		}
	}

}
