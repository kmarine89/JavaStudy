package pattern.P.commandStack;

public interface ReversibleCommand {
	void redo();
	void undo();
}
