package com.vishal.addcomplex;

import com.vishal.complex.Complex;

public class AddComplex {
	
	public Complex add(Complex c1,Complex c2){
		Complex sum=new Complex();
		sum.input(c1.getReal()+c2.getReal(), c1.getImaginary()+c2.getImaginary());
		return sum;
	}

}
