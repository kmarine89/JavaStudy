package B.observer;

public class Main {

	public static void main(String[] args) {
		
		Watcher watcher = new Watcher();
		Employee pc1 = new Employee("만화보는 놈");
		Employee pc2 = new Employee("퍼질러 자는 놈");
		Employee pc3 = new Employee("포카치는 놈");
		Spy spy = new Spy(pc3);
		
		// pc1, pc2, pc3, spy를 옵저버에 등록 (Watcher는 옵저버임)
		watcher.addObserver(pc1);
		watcher.addObserver(pc2);
		watcher.addObserver(pc3);
		watcher.addObserver(spy);

		// action이 발생하면 pc1, pc2, pc3, spy 등록한 역순으로 action을 알아차림
		watcher.action("사장 뜸.");

		// pc3, spy 옵저버 삭제
		watcher.deleteObserver(pc3);
		watcher.deleteObserver(spy);
		
		// 이제 action이 발생해도 pc3, spy는 발생 여부를 모름
		watcher.action("사장 뜸.");
	}

}
