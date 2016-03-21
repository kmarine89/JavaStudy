package B.observer;

public class Main {

	public static void main(String[] args) {
		
		Watcher watcher = new Watcher();
		Employee pc1 = new Employee("��ȭ���� ��");
		Employee pc2 = new Employee("������ �ڴ� ��");
		Employee pc3 = new Employee("��īġ�� ��");
		Spy spy = new Spy(pc3);
		
		// pc1, pc2, pc3, spy�� �������� ��� (Watcher�� ��������)
		watcher.addObserver(pc1);
		watcher.addObserver(pc2);
		watcher.addObserver(pc3);
		watcher.addObserver(spy);

		// action�� �߻��ϸ� pc1, pc2, pc3, spy ����� �������� action�� �˾�����
		watcher.action("���� ��.");

		// pc3, spy ������ ����
		watcher.deleteObserver(pc3);
		watcher.deleteObserver(spy);
		
		// ���� action�� �߻��ص� pc3, spy�� �߻� ���θ� ��
		watcher.action("���� ��.");
	}

}
