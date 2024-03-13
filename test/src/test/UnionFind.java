package test;

public class UnionFind {

	int defaultSize = 5;
	int[] setArray = new int[defaultSize];

	public UnionFind() {

	}// end CONSTRUCTOR

	public void union(int A, int B) {
		if (isInputAvailable(A)) {
			if (isInputAvailable(B)) {
				setArray[findIndex(B)] = findIndex(A);
				return;
			} // end if
			System.out.println("input B is not available");
			return;

		} // end if
		System.out.println("input A is not available");
	}// end method

	public void find(int A, int B) {
		if (setArray[A] == setArray[B]) {
			System.out.println("they are connected");
			return;
		}

		System.out.println("they are NOT connected");
	}// end method

	public boolean isInputAvailable(int input) {
		for (int index = 0; index < setArray.length; index++) {
			if (input == setArray[index]) {
				return true;
			} // end if
		} // end for
		return false;
	}// end method

	public int findIndex(int input) {
		for (int index = 0; index < setArray.length; index++) {
			if (input == setArray[index]) {
				return index;
			} // end if
		} // end if
			// this is irrelevant
		return -1;
	}// end method

	public void populateArray() {
		for (int i = 0; i < setArray.length; i++) {
			setArray[i] = i;
		}
	}// end method

	public void print() {
		for (int i = 0; i < setArray.length; i++) {
			System.out.print(setArray[i] + " ");
		}
		System.out.println();
	}// end method

}// end class
