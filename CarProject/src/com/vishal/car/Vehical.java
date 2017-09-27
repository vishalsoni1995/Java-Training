package com.vishal.car;

public class Vehical {

	private int regNo;
	private String vehicalType;
	private String model,color;

	
	public Vehical(int regNo, String model, String color, String vehicalType) {
		this.regNo = regNo;
		this.model = model;
		this.color = color;
		this.vehicalType = vehicalType;
	}

	public int getRegNo() {
		return regNo;
	}
	
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getModel() {
		return model;
	}
	
	public String getvehicalType() {
		return vehicalType;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setvehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void display()
	 {
		 
	 }
	
	public void displayVehicalType()
	 {

	 }
	
}
