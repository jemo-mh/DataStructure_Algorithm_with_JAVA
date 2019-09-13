package Repetitive_Statement;
import java.util.Scanner;

public class sum_for_positive {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n;
		
		System.out.println("sum 1 to n, just for positve");
		
		do {
			System.out.print("n is  : ");
			n=scanner.nextInt();
		}while(n<=0);
		
		int sum=0;
		
	
	for(int i=1;i<=n;i++)
	{
		sum+=i;
	}
	
		System.out.println("sum of 1 to " + n+" is "+sum);
	}

}
