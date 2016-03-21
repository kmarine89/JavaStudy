package B.observer;

import java.util.Observable;
import java.util.Observer;

public class Employee implements Observer {

	public String desc;

	public Employee(String desc) {
		this.desc = desc;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Watcher) {
			System.out.println(desc + "�� ���ϴ� ô");
		}
	}

	public String getDesc() {
		return desc;
	}
}
