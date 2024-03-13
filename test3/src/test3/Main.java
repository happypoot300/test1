package test3;

public class Main {

	static UnionFind unionFind = new UnionFind();

	public static void main(String[] args) {
		unionFind.print();
		unionFind.union(0, 1);
		unionFind.union(2, 3);
		unionFind.print();
		unionFind.printAll();
	}// end main

}// end class
