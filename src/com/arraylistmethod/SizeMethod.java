package com.arraylistmethod;

import java.util.ArrayList;

public class SizeMethod {
	public static void main(String[] args) {
		// string type array list use
		ArrayList<String> fruit = new ArrayList();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("grap");
		fruit.add("plum");

		// Display of Arraylist Using Size() method
		System.out.println("Fruit Size: " + fruit.size());

		// integer type array list use
		ArrayList<Integer> qty = new ArrayList();
		qty.add(10);
		qty.add(20);
		qty.add(30);
		qty.add(40);

		// Display of Arraylist Using Size() method
		System.out.println("Fruit Size: " + qty.size());

	}
}
