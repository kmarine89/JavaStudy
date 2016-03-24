package pattern.C.factory;

public class AnimalFactory {
	public static Animal create(String animalName) {
		if(animalName == null) {
			throw new IllegalArgumentException("null은 안되용~");
		}
		try {
			Class<?> c = Class.forName(animalName);
			return (Animal) c.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
		
		/*
		if(animalName.equals("소")) {
			return new Cow();
		} else if(animalName.equals("고양이")) {
			return new Cat();
		} else if(animalName.equals("개")) {
			return new Dog();
		} else {
			return null;
		}
		*/
	}
}
