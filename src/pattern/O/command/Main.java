package pattern.O.command;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Command> cmds = new ArrayList<Command>();
		
		cmds.add(new Command() {
			@Override
			public void execute() {
				System.out.println("»ğÁú ¿ä~");
			}
		});
		
		cmds.add(new Command() {
			@Override
			public void execute() {
				System.out.println("¾îµÏÀÌ³ª ¸ÔÀÚ..");
			}
		});
		
		for (Command command : cmds) {
			command.execute();
		}
	}

}
