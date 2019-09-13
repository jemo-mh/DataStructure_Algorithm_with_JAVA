package Repetitive_Statement;
import java.util.Scanner;

public class for_sum {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("sum 1 to n, using for");
		
		System.out.println("n is :");
		int n= scanner.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("sum of 1 to " + n+" is "+sum);
	}
}
