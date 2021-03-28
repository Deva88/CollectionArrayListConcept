package com.arraylistmethod;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		//Array to ArrayList
		String[] arr= {"A","B","c"};
		for(String s:arr) {
			System.out.println(s);
		}
			ArrayList<String> alist =new ArrayList(Arrays.asList(arr));
			System.out.println("Array List :" +alist);
		
		
			
	}

}
