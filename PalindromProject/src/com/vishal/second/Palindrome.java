package com.vishal.second;

import com.vishal.first.Reverse;

public class Palindrome {
	
	private int actualNumber;
   
	 public void setNumber(int n)
	 {
		 actualNumber = n;
	 }
	 
	 public boolean check()
	 {
		 Reverse s = new Reverse();
		 if (actualNumber == s.findReverse(actualNumber))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }

}
