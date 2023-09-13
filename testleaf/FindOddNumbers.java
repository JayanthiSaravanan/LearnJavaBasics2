package org.testleaf;

import java.util.Iterator;

public class FindOddNumbers {

	public static void main(String[] args) {

		int num =10;
		
		for (int i =0 ; i<=num; i++) {
			if (i%2 !=0) {
				System.out.println("odd number is : " +i);
			}
		}

	}

}
