package com.vishal.pet;

public class Person  {
	
	private Animal animal;
 
	public Person(Animal a) {
		this.animal = a;
	}

	public void pet()
	{
		System.out.println("Person has pet"  + animal.getBreed() + animal.getType() );
		animal.sound();
	}

}
