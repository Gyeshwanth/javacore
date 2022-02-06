package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	
		int arr[][] = {{2,3,5},
				   	   {4,5,6},
				   	   {7,8,9}
				   	   };
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(arr[0][1]);
		
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("1");
		set.add("sjhf");
		set.add("852");
		for (String string : set) {
			
			System.out.println(string);
		}
		
		
	}
}
