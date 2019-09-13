package Repetitive_Statement;
import java.util.Scanner;

public class isosceles_right_triangle {

	public static void  main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n;
		
		System.out.println("print isosceles right triangle that left angle is 90 degree ");
		do {
			System.out.print("how many row in this triangle?");
			n=scanner.nextInt();
		}while(n<=0);
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}

