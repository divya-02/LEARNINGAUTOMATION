package com.day6.java;

public class Day6_ForLoop_Homework {

	public static void main(String[] args) {
		
		First100NaturalNumbers();
		First50EvenNumber();
		First50OddNumber();
		ReverseFrom100to1();
		ReverseFrom99to3with3Separations();
		Multiplesof10AndSumOfMultiples();
		RevereseFrom100to5with5seperationsAndSumofRevereseNumbers();
		
	}
	
	public static void First100NaturalNumbers(){
		//can you write a program to print first 100 natural numbers using for loop
		System.out.println("First 100 natural numbers are:");
		for(int i=1 ;i<=100;i++){
			System.out.print(i + " ");
		}
	}
	
	public static void First50EvenNumber() {
		//can you write a program to print first 50 even numbers using for loop
		int evenNumbers,count = 0;
		System.out.println("\nFirst 50 Even numbers are :");
		for(int i =1 ; count<=50 ; i++) {
			evenNumbers =  i;
			if(evenNumbers % 2 == 0) {
				System.out.print(evenNumbers + " ");
				count++;		
			}
		}
	}
	
	public static void First50OddNumber() {
		//can you write a program to print first 50 old numbers using for loop
		int oddNumbers = 0,count = 0;
		System.out.println("\nFirst 50 Old numbers are :");
		for(int i =1 ; count<=50 ; i++) {
			oddNumbers =  i;
			if(oddNumbers % 2 != 0) {
				System.out.print(oddNumbers + " ");
				count++;
			}
		}
	}
	
	public static void ReverseFrom100to1() {
		//write a program to print reversely from 100 to 1 using for loop
		System.out.println("\nReverse Number from 100 to 1");
		for(int i=100;i>=1;i--) {
			System.out.print(i +" ");
		}
	}
	
	public static void ReverseFrom99to3with3Separations() {
		//write a program to print reversely from 99 till 3 with 3 separations - 99, 96, 93, 90, ......... 3
		System.out.println("\nReverse Number from 99 to 3 with separation of 3");
		for(int i=99 ; i>=3 ;i-=3) {
			System.out.print(i + " ");
		}
	}
	
	public static void Multiplesof10AndSumOfMultiples() {
		//write a program to print first 10 multiples of 5 and add the sum of the multiples
		System.out.println("\nFirst 10 multiples of 5 and Sum of Multiples");
		int count =0 ,multiples = 0,sumofMultiples = 0;
		for(int i = 1 ; count <=10;i++) {
			multiples = i * 5;
			System.out.print(multiples +" ");
			count++;
			sumofMultiples += multiples;	
		}
		System.out.println("\nSum of first 10 Multiples of 5 :" + sumofMultiples);
		
	}
	
	public static void RevereseFrom100to5with5seperationsAndSumofRevereseNumbers() {
		//write a program to print from 100 till 5 reversely - 100,95,90,......5 and then add the sum of all the reverse multiples and give the value
		System.out.println("Reverse from 100 to 5 with separation of 5");
		int sumOfRevereseNumber = 0;
		for(int i=100;i>=5;i-=5) {
			System.out.print(i +" ");
			sumOfRevereseNumber += i;
		}
		System.out.println("\nSum of the number Reverse from 100 to 5 with separation of 5 : "+sumOfRevereseNumber );
	}	
}
