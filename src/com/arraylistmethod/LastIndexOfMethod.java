package com.arraylistmethod;

	import java.util.ArrayList;

	public class LastIndexOfMethod {

		public static void main(String[] args) {
			ArrayList<String> alist = new ArrayList();
			alist.add("A");
			alist.add("B");
			alist.add("C");
			alist.add("D");
			alist.add("D");
			alist.add("E");
			System.out.println("Find Last Index Number :" + alist.lastIndexOf("A"));
			System.out.println("Find Last Index Number :" + alist.lastIndexOf("B"));
			System.out.println("Find Last Index Number :" + alist.lastIndexOf("C"));
			
			//Duplicate value always Return Last occurrence
			System.out.println("Find Last Index Number :" + alist.lastIndexOf("D"));

		}

	}



