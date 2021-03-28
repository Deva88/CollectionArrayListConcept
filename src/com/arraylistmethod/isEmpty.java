package com.arraylistmethod;
import java.util.ArrayList;
public class isEmpty {
	


		public static void main(String[] args) {
			// string type array list use
			ArrayList<String> fruit = new ArrayList();
			fruit.add("Apple");
			fruit.add("Mango");
			fruit.add("grap");
			fruit.add("plum");


			
			
		
			// integer type array list use
			ArrayList<Integer> qty = new ArrayList();
			qty.add(10);
			qty.add(20);
			qty.add(30);
			qty.add(40);
			
			//remove all element Using clear()method
			qty.clear();
			
			//checking ArrayList Empty or Not
			System.out.println(fruit.isEmpty());
			System.out.println(qty.isEmpty());

		}
	}


