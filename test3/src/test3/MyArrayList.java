package test3;

public class MyArrayList {

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
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		System.out.println("node: " + arrayOfNodes[index].getData());
		return arrayOfNodes[index];
	}// end method

	public void remove(int index) {
		for (int i = index; i < arrayOfNodes.length - 1; i++) {
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

	public int size() {
		return arrayOfNodes.length;
	}// end method
}// end class
