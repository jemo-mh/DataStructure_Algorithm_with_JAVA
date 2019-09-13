package Repetitive_Statement;
import java.util.Scanner;
public class while_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("sum 1 to n, using while");
		System.out.println("n is : ");
		int n = scanner.nextInt();
		
		int sum=0;
		int i=1;
		
		while(i<=n) {
			sum +=i;
			i++;
		}
		System.out.println("sum of 1 to " + n+" is "+sum);
		
		
		
	}

}
