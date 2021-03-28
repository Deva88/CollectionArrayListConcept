package com.arraylistmethod;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		//ArrayList to Array
		ArrayList<String> alist= new ArrayList();
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("D");
		alist.add("E");
		System.out.println("Array List :" +alist);
		String[] arr =new String[alist.size()];
		alist.toArray(arr);
		System.out.println("Array");
		for(String s:arr) {
			System.out.println(s);
		}
			//Find Array Length
			System.out.println("Array Length: " +arr.length);
			
		
	}
	}

