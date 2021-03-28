package com.arraylistmethod;

import java.util.ArrayList;
import java.util.Collections;

public class SwapMethod {

	public static void main(String[] args) {
		//Use Swap Method 
		ArrayList<Integer> alist = new ArrayList();
		alist.add(10);
		alist.add(0);
		alist.add(20);
		alist.add(0);
		alist.add(5);
		alist.add(0);
		System.out.println("Before Swapping :" +alist);
		
		Collections.swap(alist, 1, 4);
		System.out.println("After Swapig :" +alist);
		
	}

}
