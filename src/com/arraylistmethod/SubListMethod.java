package com.arraylistmethod;

import java.util.ArrayList;

public class SubListMethod {

	public static void main(String[] args) {
		//Using Sublist Method
		ArrayList<String> alist= new ArrayList();
		alist.add("A");
		alist.add("D");
		alist.add("E");
		alist.add("V");
		alist.add("Z");
		alist.add("F");
		
		ArrayList<String> al = new ArrayList(alist.subList(1, 4));
		
		System.out.println("Orignal List :" +alist);
		System.out.println("SubList :" +al);

	}

}
