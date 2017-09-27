
public class Inheritance 
{
		public void display()
		{
			System.out.println(  "I am show of base classs");
		}
}

class Base extends Inheritance
{
	public void display()
	{
		System.out.println(  "I am show of derived class classs");
	}
}

class Main
{
public static void main(String argsp[])
{
	Inheritance i = new Inheritance();
	i.display();
	Base b= new Base();
	b.display();
	
	Inheritance x = new Base();
	x.display();
	x = new Inheritance();
	x.display();
	
			
}
}

