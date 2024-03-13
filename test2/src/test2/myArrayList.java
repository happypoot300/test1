package test2;

public class myArrayList {

	int defaultSize = 10;
	Node[] arrayOfNodes = new Node[defaultSize];
	int pointer = 0;

	public void add(Node node) {
		if (pointer == arrayOfNodes.length) {
			resize();
		} // end if
		arrayOfNodes[pointer++] = node;
	}// end method

	public Node get(int index) {
		if (index < 0 || index >= arrayOfNodes.length) {
			System.out.println("Index out of Bound");
			return null;
		}
		return arrayOfNodes[index];
	}// end method

	public void remove(int index) {
		for (int i = index; i < arrayOfNodes.length; i++) {
			arrayOfNodes[i] = arrayOfNodes[i + 1];
		} // end for
	}// end method

	public void resize() {
		Node[] temp = new Node[arrayOfNodes.length * 2];
		for (int i = 0; i < arrayOfNodes.length; i++) {
			temp[i] = arrayOfNodes[i];
		} // end for
		arrayOfNodes = temp;
	}// end method

}// end class
