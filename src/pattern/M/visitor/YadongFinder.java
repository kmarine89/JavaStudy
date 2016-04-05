package pattern.M.visitor;

import java.util.ArrayList;
import java.util.List;

public class YadongFinder implements Visitor {

	private List<String> yadongList = new ArrayList<String>();
	private List<String> currentList = new ArrayList<String>();
	
	public YadongFinder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visit(Acceptor acceptor) {
		if(acceptor instanceof Composite) {
			Composite composite = (Composite) acceptor;
			currentList.add(composite.getComponentName());
			List<Component> children = composite.getChildren();
			for (Component component : children) {
				component.accept(this);
			}
			currentList.remove(currentList.size()-1);
		} else if (acceptor instanceof Leaf) {
			Leaf leaf = (Leaf) acceptor;
			doSomething(leaf);
		}
	}

	protected void doSomething(Leaf leaf) {
		if(isYadong(leaf)) {
			String fullPath = getFullPath(leaf);
			yadongList.add(fullPath);
		}
	}

	protected boolean isYadong(Leaf leaf) {
		return leaf.getComponentName().endsWith(".avi");
	}

	protected String getFullPath(Leaf leaf) {
		StringBuilder fullPath = new StringBuilder();
		for (String element : currentList) {
			fullPath.append(element).append("\\");
		}
		return fullPath.append(leaf.getComponentName()).toString();
	}

	public List<String> getYadongList() {
		return yadongList;
	}
	
}
