package Repetitive_Statement;
import java.util.Scanner;

public class limit_range {
	
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		int num;
		
		System.out.println("input two integer");
		do {
			System.out.print("input : ");
			num=scanner.nextInt();
			
		}while(num<10 || num>99);
		
		System.out.println("variable value of n is "+ num);
	}
	

}
