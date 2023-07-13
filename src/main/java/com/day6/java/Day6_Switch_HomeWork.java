package com.day6.java;

public class Day6_Switch_HomeWork {

	public static void main(String[] args) {
		int year = 1988;
		switch (year % 4) {
        case 0:
            if ((year % 100 == 0) && (year % 400 != 0)) {
                System.out.println(year + " is not a leap year.");
            } else {
                System.out.println(year + " is a leap year.");
            }
            break;
        default:
            System.out.println(year + " is not a leap year.");
            break;
    }

	}
	
}
