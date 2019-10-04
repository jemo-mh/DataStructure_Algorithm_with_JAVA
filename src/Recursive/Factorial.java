package Recursive;
import java.util.Scanner;

public class Factorial {
	//return factorial of the positive number N
	static int factorial(int n) {
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;		
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("input the number : ");
		int n= scanner.nextInt();
		System.out.println("the factorial of "+n+ " is "+factorial(n));
	}
}
