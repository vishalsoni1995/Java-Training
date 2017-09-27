package com.vishal.car;

import java.util.Scanner;

public class Person {
	
//	private Car[] car;
//	private int noOfCars;
//	private String personName;
//	
//	public Person(int noOfCars) {
//		this.noOfCars = noOfCars;
//		car = new Car[noOfCars];
//	}
//	
//	public void inputPersonDetails()
//	{
//		System.out.println("Enter person name: ");
//		Scanner s = new Scanner(System.in);
//		personName = s.next();
//		for(int index=0; index<noOfCars;index++)
//		{
//			System.out.println("Enter car type: ");
//			String type = s.next();
//			if(type.equalsIgnoreCase("Bmw"))
//			{
//				System.out.println("Enter model no:  ");
//				String model = s.next();
//				System.out.println("Enter color:  ");
//				String color = s.next();
//               car[index] = new BMW(index, model, color);
//			}
//		}
//		
//	}
//	
//	public void display()
//	{
//		System.out.println("Person name:  " + personName);
//		for (Car v:car)
//		{
//			System.out.println("Car model: " + v.getModel());
//			System.out.println("Car color: " + v.getColor());
//			v.display();
//		}
//	}
	
	private Vehical[] vehical;
	private int noOfVehical;
	private String personName;
	
	public Person(int noOfVehical) {
		this.noOfVehical = noOfVehical;
		vehical = new Vehical[noOfVehical];
	}
	
	public void inputPersonDetails()
	{
		System.out.println("Enter person name: ");
		Scanner s = new Scanner(System.in);
		personName = s.next();
		for(int index=0; index<noOfVehical;index++)
		{
			System.out.println("Enter vehical type: ");
			String type = s.next();
			if(type.equalsIgnoreCase("car"))
			{
				if(type.equalsIgnoreCase("Bmw"))
				{
					System.out.println("Enter reg  no:  ");
					int reg = s.nextInt();
					System.out.println("Enter model no:  ");
					String model = s.next();
					System.out.println("Enter color:  ");
					String color = s.next();
	               Car car  = new Car(reg, model, color);
	               vehical[index] = new Vehical(reg,model,color);
				}
			}
			
			else
			{
				if(type.equalsIgnoreCase("tata"))
				{
					System.out.println("Enter reg  no:  ");
					int reg = s.nextInt();
					System.out.println("Enter model no:  ");
					String model = s.next();
					System.out.println("Enter color:  ");
					String color = s.next();
					Car car  = new Car(reg, model, color);
					vehical[index] = new Vehical(reg,model,color);
				}
			}
		
			
			
			
		}
		
	}
	
	public void display()
	{
		System.out.println("Person name:  " + personName);
		for (Vehical v:vehical)
		{
			v.displayVehicalType();
			System.out.println("Car regNo: " + v.getRegNo());
			System.out.println("Car model: " + v.getModel());
			System.out.println("Car color: " + v.getColor());
			v.display();
		}
	}
	
	
}
