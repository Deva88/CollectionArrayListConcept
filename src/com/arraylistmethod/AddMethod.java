package com.arraylistmethod;

import java.util.*;
public class AddMethod {

	public static void main(String[] args) {
		// string type array list use
		ArrayList<String> fruit = new ArrayList();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("grap");
		fruit.add("plum");
		// simple way Display the complete Array list
		System.out.println(fruit);

		// Display iterate() method of Arraylist for loop
		for (String s : fruit)
			System.out.println(s);

		// integer type array list use
		ArrayList<Integer> qty = new ArrayList();
		qty.add(10);
		qty.add(20);
		qty.add(30);
		qty.add(40);

		// simple way Display the complete Array list
		System.out.println(qty);

		// Display iterate() method of Arraylist for loop
		for (Integer a : qty)
			System.out.println(a);

	}

}
