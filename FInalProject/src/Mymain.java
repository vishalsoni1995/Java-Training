

import com.vishal.second.Palindrome;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		p.setNumber(12215);
//		boolean result = p.check();
		if(p.check())
				System.out.print("palindrome");
		else
			System.out.print("not palindrome");
					

	}

}
