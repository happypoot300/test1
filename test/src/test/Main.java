package test;

public class Main {

	static UnionFind unionFind = new UnionFind();

	public static void main(String[] args) {
		unionFind.populateArray();
		unionFind.print();

		unionFind.union(1, 2);
		unionFind.union(1, 3);
		unionFind.print();

		unionFind.find(1, 3);

	}// end main

}// end class