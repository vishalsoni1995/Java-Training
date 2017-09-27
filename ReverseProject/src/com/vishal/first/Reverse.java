package com.vishal.first;
public class Reverse {
	
	private int number, reverse;
	
	public void setNumber(int n)
	{
		number = n;
	}
	
	public int findReverse(int n)
	{
		setNumber(n);
		int sum=0;
		int rem;
		while(number!=0)
		{
		rem = number%10;
		sum = sum*10 + rem;
    	number = number/10;	
		}	
		reverse = sum;
		int result = getReverse();
		return result;
		
	}
	
	public int getReverse()
	{
		return reverse;
	}

}
