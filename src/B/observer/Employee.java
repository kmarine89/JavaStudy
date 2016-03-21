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
			System.out.println(desc + "이 일하는 척");
		}
	}

	public String getDesc() {
		return desc;
	}
}
