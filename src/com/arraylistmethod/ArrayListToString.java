package com.arraylistmethod;

import java.util.ArrayList;

public class ArrayListToString {

	public static void main(String[] args) {
		// Array List To String
		ArrayList<String> alist = new ArrayList();
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("D");
		System.out.println("Array List :" +alist);
		String s=alist.toString();
		System.out.println("String Version : " +s);
		System.out.println("Array List of Size :" +alist.size());
		System.out.println("String of Size :" +s.length());

	}

}
