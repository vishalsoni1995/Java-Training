package com.vishal;

class Vishal
{
	static int a;
	
	
	{
		a = a+1;
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Vishal v = new Vishal();
		Vishal v2 = new Vishal();
		System.out.println("Times: " + Vishal.a);
 		
	}

}
