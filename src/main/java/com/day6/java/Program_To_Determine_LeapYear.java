package com.day6.java;

public class Program_To_Determine_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year1 =2000;
		int year2 = 1998;
		int year3 = 1996;
		int year4 =2016;
		//It is evenly divisible by 100
		//If it is divisible by 100 ,then it should be also be divisible by 400
		//Except this , all other years evenly divisible by 4 are leap years
		
		if(((year1 % 4 == 0) && (year1 % 100 != 0)) || (year1 % 400 == 0)	){
			System.out.println("Specified year is a Leap year : "+year1);
		}else {
			System.out.println("Year is a Leap year "+year1);
		}
		
		
		if(((year2 % 4 == 0) && (year2 % 100 != 0)) || (year2 % 400 == 0)	){
			System.out.println("Specified year is a Leap year : "+year2);
		}else {
			System.out.println("Year is a Leap year "+year2);
		}

		if(((year3 % 4 == 0) && (year3 % 100 != 0)) || (year3 % 400 == 0)	){
			System.out.println("Specified year is a Leap year : "+year3);
		}else {
			System.out.println("Year is a Leap year "+year3);
		}

		if(((year4 % 4 == 0) && (year4 % 100 != 0)) || (year4 % 400 == 0)	){
			System.out.println("Specified year is a Leap year : "+year4);
		}else {
			System.out.println("Year is a Leap year "+year4);
		}

	}

}
