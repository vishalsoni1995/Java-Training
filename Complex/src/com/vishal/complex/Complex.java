package com.vishal.complex;

public class Complex {
	private int imaginary, real;
	
	public void input(int x,int y)
	{
		imaginary = x;
		real = y;
	}

	public int getImaginary() {
		return imaginary;
	}


	public int getReal() {
		return real;
	}
	
	public void display()
	{
		System.out.print(real );
		if(imaginary>=0)
			System.out.println("+"+imaginary+"i");
		else
			System.out.println(imaginary+"i");
	}

}
