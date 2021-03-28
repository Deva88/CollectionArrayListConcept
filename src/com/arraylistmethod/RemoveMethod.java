package com.arraylistmethod;

import java.util.ArrayList;

public class RemoveMethod {
	public static void main(String[] args) {
		// string type array list use
		ArrayList<String> fruit = new ArrayList();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("grap");
		fruit.add("plum");

		//remove element
		fruit.remove(0);
		
		
		// Display iterate() method of Arraylist for loop
		for (String s : fruit)
			System.out.println(s);

		// integer type array list use
		ArrayList<Integer> qty = new ArrayList();
		qty.add(10);
		qty.add(20);
		qty.add(30);
		qty.add(40);

		//remove element(Using removeAll() method to remove all)
		qty.removeAll(qty);
		
		//remove all element Using clear()method
		qty.clear();
		
		
		// Display iterate() method of Arraylist for loop
		for (Integer a : qty)
			System.out.println(a);

	}
}
