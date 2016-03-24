package pattern.C.factory;

public class AnimalFactory {
	public static Animal create(String animalName) {
		if(animalName == null) {
			throw new IllegalArgumentException("null�� �ȵǿ�~");
		}
		try {
			Class<?> c = Class.forName(animalName);
			return (Animal) c.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
		
		/*
		if(animalName.equals("��")) {
			return new Cow();
		} else if(animalName.equals("�����")) {
			return new Cat();
		} else if(animalName.equals("��")) {
			return new Dog();
		} else {
			return null;
		}
		*/
	}
}
