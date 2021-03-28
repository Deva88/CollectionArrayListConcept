package com.arraylistmethod;

import java.util.ArrayList;
import java.util.Collections;
public class SortingArrayList {


		public static void main(String[] args) {
			System.out.println("---------------String Sorting---------------");
		//string Sorting in Ascending and Desending Order
			ArrayList<String> alist =new ArrayList();
			alist.add("B");
			alist.add("E");
			alist.add("A");
			alist.add("C");
			alist.add("F");
			System.out.println("Before Sorting (without sort): " +alist);
			//Ascending sort
			Collections.sort(alist);
			System.out.println("After sorting (Default sort): " +alist);
			//Desending Sort
			Collections.sort(alist, Collections.reverseOrder());
			System.out.println("After sorting (Desending sort) :" +alist);
			
			
			
			System.out.println("---------------Integer Sorting---------------");
			
			//Integer Sorting in Ascending and Desending Order
					ArrayList<Integer> al =new ArrayList();
					al.add(50);
					al.add(30);
					al.add(80);
					al.add(60);
					al.add(10);
					System.out.println("Before Sorting (without sort): " +al);
					//Ascending sort
					Collections.sort(al);
					System.out.println("After sorting (Default sort): " +al);
					//Desending Sort
					Collections.sort(al, Collections.reverseOrder());
					System.out.println("After sorting (Desending sort) :" +al);



		}

	}
