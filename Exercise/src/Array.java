import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int arr[][];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total no of rows: ");
		int rows = s.nextInt();
		System.out.println("Enter total no of cols: ");
		int cols = s.nextInt();
		arr = new int[rows][cols];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			arr[i][j] = i + j;
		}
		 for(int[] ar:arr)
		 {
			 for(int  element:ar)
			 System.out.print(element + "  ");
			 System.out.println();
		 }
		 
		
	}

}
