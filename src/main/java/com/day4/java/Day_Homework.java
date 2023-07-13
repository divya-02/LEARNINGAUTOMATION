package com.day4.java;

public class Day_Homework {

	public static void main(String[] args) {
		int i = 10;  //latest value of i is 10
		
		int j = --i - i++;
		//j   = 9   - 9 // latest value of j is 0
		//i = 9     10  // latest value of i is 10
		
		int k = i-- - --i + i++ - --j;
		  //k = 10 -    8 + 8   - -1   //latest value of k is 11
		  //i = 9 ,     8 , 9          // latest value of i is 9
		  //j = -1					   // latest value of j is -1
	 
		int l = i++ + j++ + --j - --k - --i;
		
		//l  = 9   +  -1  +  -1 -  10 - 9   //latest value of l is 12
		//i = 10                        9   //latest value of i is 9
		//j =       0  ,  -1                //latest value of j is -1
		//k = 10                            //latest value of k is 10
		 
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
