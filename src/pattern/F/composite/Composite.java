package pattern.F.composite;

public class Composite extends Component {

	public Composite(String componentName) {
		super(componentName);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}
	
}
