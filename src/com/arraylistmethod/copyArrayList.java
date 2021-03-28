package com.arraylistmethod;

import java.util.ArrayList;

public class copyArrayList {


	public static void main(String[] args) {
		
	
		// integer type array list use
		ArrayList<Integer> qty = new ArrayList();
		
		qty.add(10);
		qty.add(20);
		qty.add(30);
		qty.add(40);
		
		//copy all element to another element in ArrayList
		ArrayList<Integer> qty1= new ArrayList();
		qty1.addAll(qty);
		System.out.println(qty1);
		qty1.add(50);
		qty1.add(60);
		System.out.println(qty1);
	}

}
