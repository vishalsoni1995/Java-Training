package com.vishal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int size;
		Scanner s = new Scanner(System.in);
//		int numbers[];
		ArrayMain myarraysize = new ArrayMain();
		System.out.println("Enter size of array: ");
		try
		{
		size = s.nextInt();
		myarraysize.setArray(size);
		System.out.println("Enter elements of array ");
		for (int i=0;i<myarraysize.getSize();i++)
		{
			myarraysize.getArray()[i] = s.nextInt();
		}

		System.out.println("Enter element whose occcurence you want to find:  ");
		int element = s.nextInt();
		int times = 0;
		for(int i = 0; i<myarraysize.getSize();i++)
		{
			if (myarraysize.getArray()[i] == element)
					{
				      times++;
					}
		}
		  System.out.println(element + " has occur  " + times + " times ");
		}
		
		catch(InputMismatchException ex)
		{
			System.out.println("Plase enter correct format");
		}
		catch(Exception ex)
		{
			System.out.println("error");
		}
		
	}

}

