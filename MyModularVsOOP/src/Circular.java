class CheckCircular
{
	private int originalNumber;
	
	public void setNumber(int number)
	{
		originalNumber = number;
	}
	
	public boolean function()
	{
		int unit = originalNumber%10;   //4
		int number = originalNumber/10;   //10256
		
		int len=0;
		int number2 = number;
		while(number2 != 0)
		{
			number2 = number2/10;
			len++;
		}
		
	    int after = originalNumber*unit; //410256
		
	    if(unit*Math.pow(10, len) + number == after)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
	

}


public class Circular {

	public static void main(String[] args) {
		
		CheckCircular a = new CheckCircular();
		a.setNumber(102564);
		boolean b = a.function();
		System.out.println(b);
		

	}

}
