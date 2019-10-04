package Recursive;
import java.util.Scanner;

public class analysis_recursive {
	static void recursive(int n) {
		if(n>0) {
			recursive(n-1);
			System.out.println(n);
			recursive(n-2);
			System.out.println("------------");
		}
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("input the number ");
		int  n=scanner.nextInt();
		recursive(n);
	}
}
