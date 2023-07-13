package com.day6.java;

public class Program_To_Determine_Number_is_Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 21;
		int j = 22;
		if(i % 2 == 0) {
			System.out.println("i is even");
		}else{
			System.out.println("i is odd");
		}

		if(j % 2 == 0) {
			System.out.println("j is even");
		}else{
			System.out.println("j is odd");
		}
		
		
		
		if(i % 2 == 0 && j%2 == 0) {
			System.out.println("i and j both are even");
		}else if(i % 2 == 0 && j%2 != 0){
			System.out.println("i is even");
			System.out.println("j is odd");
		}else if(i % 2 != 0 && j%2 == 0){
			System.out.println("i is odd");
			System.out.println("j is even");
		}else {
			System.out.println("Neither of the numbers are even");
		}
		
		
		
	}

}
