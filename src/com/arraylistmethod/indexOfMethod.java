package com.arraylistmethod;

import java.util.ArrayList;

public class indexOfMethod {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList();
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("D");
		alist.add("D");
		alist.add("E");
		System.out.println("Find Index Number :" + alist.indexOf("A"));
		System.out.println("Find Index Number :" + alist.indexOf("B"));
		System.out.println("Find Index Number :" + alist.indexOf("E"));
		
		//Duplicate value always Return First occurrence
		System.out.println("Find Index Number :" + alist.indexOf("D"));

	}

}
