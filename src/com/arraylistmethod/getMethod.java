package com.arraylistmethod;

import java.util.ArrayList;

public class getMethod {
	public static void main(String[] args) {
		// string type array list use
		ArrayList<String> fruit = new ArrayList();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("grap");
		fruit.add("plum");

		// Display of Arraylist Using get() method
		System.out.println("Fruit Index Number 2: " + fruit.get(2));

		// integer type array list use
		ArrayList<Integer> qty = new ArrayList();
		qty.add(10);
		qty.add(20);
		qty.add(30);
		qty.add(40);

		// Display of Arraylist Using get() method
		System.out.println("qty Index Number 2: " + qty.get(2));

	}
}
