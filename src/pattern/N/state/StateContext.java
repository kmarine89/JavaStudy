package pattern.N.state;

public class StateContext {

	private State currentState;
	public StateContext() {
		currentState = State.getInitState();
	}
	public void processEvent(Action action) {
		State next = currentState.act(action);
		if(next != null) {
			currentState.onExit();
			System.out.println(action+"�� ���� State�� "+currentState+"���� "+next+"�� �ٲ�.");
			currentState = next;
			currentState.onEntry();
			if(State.isFinalState(currentState)) {
				System.out.println("����~ ������ State�� �����߳�...");
			}
		} else {
			System.out.println(action+"�� State�� "+currentState+" ������ �ǹ� ���� ��.");
		}
	}
	
}
