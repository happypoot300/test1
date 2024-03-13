package test3;

public class Node {
	private int data;
	private Node down;

	public Node(int data) {
		this.setData(data);
		this.setDown(null);
	}// end constructor

	// == getter setter == //
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node down) {
		this.down = down;
	}
}// end class
