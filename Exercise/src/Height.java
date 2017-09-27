class AddHeight
{

	private int feetResult,inchesResult;
	
	public void addHeight(CalculateHeight x, CalculateHeight y)
	{
	  feetResult = x.getFeet() + y.getFeet();
	  inchesResult = x.getInches() + y.getInches();
	  if (inchesResult > 12)
	  {
		  feetResult = feetResult + inchesResult/12;
		  inchesResult = inchesResult%12; 
	  }
	
	}
	
	public void display()
	{
		System.out.println("Total height is " + feetResult + "feet" + inchesResult + "inches" );
	}

}

class CalculateHeight
{
  private int feet, inches;

public int getFeet() {
	return feet;
}

public void setFeet(int feet) {
	this.feet = feet;
}

public int getInches() {
	return inches;
}

public void setInches(int inches) {
	this.inches = inches;
}
  
}

public class Height {

	public static void main(String[] args) {
		CalculateHeight c1 = new CalculateHeight();
		c1.setInches(9);
		c1.setFeet(8);
		CalculateHeight c2 = new CalculateHeight();
		c2.setInches(4);
		c2.setFeet(7);
		
		AddHeight a = new AddHeight();
		a.addHeight(c1, c2);
		a.display();
		

	}

}
