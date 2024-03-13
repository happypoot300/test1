package test2;

import java.util.ArrayList;

public class UnionFind {

	ArrayList<Node> setOfNodes = new ArrayList<Node>();

	public UnionFind() {
		setOfNodes.add(new Node(0));
		setOfNodes.add(new Node(1));
		setOfNodes.add(new Node(2));
		setOfNodes.add(new Node(3));
		setOfNodes.add(new Node(4));
	}// end CONSTRUCTOR

	public void union(int A, int B) {
		Node nodeA;
		Node nodeB;
		if (isInputAvailable(A)) {
			nodeA = setOfNodes.get(findIndex(A));
			setOfNodes.remove(findIndex(A));
			if (isInputAvailable(B)) {
				nodeB = setOfNodes.get(findIndex(B));
				setOfNodes.remove(findIndex(B));

				if (nodeA.getDown() != null) {
					System.out.println(nodeA.getData());
					Node tempNode = nodeA;
					do {
						tempNode = tempNode.getDown();
					} while (tempNode.getDown() != null);
					tempNode.setDown(nodeB);
				} else {
					nodeA.setDown(nodeB);
				} // end if else
				setOfNodes.add(nodeA);
				return;
			} // end if
			System.out.println("input B is not available");
		} // end if
		System.out.println("input A is not available");
	}// end method

	public void find(int A, int B) {
		if (findIndex(A) == findIndex(B)) {
			System.out.println("They are connected!");
			return;
		} // end if
		System.out.println("They are NOT connected");
	}// end method

	public int findIndex(int input) {
		for (int index = 0; index < setOfNodes.size(); index++) {
			if (setOfNodes.get(index).getDown() != null) {
				if (deepSearch(setOfNodes.get(index), input)) {
					return index;
				} // end if
			} // end if

			if (input == setOfNodes.get(index).getData()) {
				return index;
			} // end if
		} // end for

		// irrelevant
		return -1;
	}// end method

	public boolean isInputAvailable(int input) {
		for (int index = 0; index < setOfNodes.size(); index++) {
			if (setOfNodes.get(index).getDown() != null) {
				return deepSearch(setOfNodes.get(index), input);
			}
			if (input == setOfNodes.get(index).getData()) {
				return true;
			} // end if
		} // end for
		return false;
	}// end class

	public boolean deepSearch(Node node, int input) {

		if (node == null) {
			System.out.println("end of node reached, Not found");
			return false;
		} // end if

		if (node.getData() == input) {
			System.out.println("data found");
			return true;
		} // end if

		return deepSearch(node.getDown(), input);
	}// end method

	public void print() {
		for (Node node : setOfNodes) {
			System.out.print(node.getData() + " ");
		}
		System.out.println();
	}// end method

	public void printAll() {
		for (int index = 0; index < setOfNodes.size(); index++) {
			if (setOfNodes.get(index).getDown() != null) {
				Node tempNode = setOfNodes.get(index);
				System.out.print("{ ");
				while (tempNode != null) {
					System.out.print(tempNode.getData() + " ");
					tempNode = tempNode.getDown();
				} // end while
				System.out.print("}");
			} else {
				System.out.print(setOfNodes.get(index).getData() + " ");
			} // end if else

		} // end for
	}// end method

}// end class
