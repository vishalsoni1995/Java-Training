import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int arr[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total no of rows: ");
		int rows = s.nextInt();
		arr = new int[rows];
		for(int index=0; index<rows; index++)
		{
			arr[index] = index + 10;
		}
		 for(int element:arr)
		 {
			 System.out.println(element);
		 }
		
	}

}
