package com.vishal.car;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
	 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of vehicals: ");
		int noOfVehicals = s.nextInt();
		Person p = new Person(noOfVehicals);
		p.inputPersonDetails();
		p.display();
	}

}
