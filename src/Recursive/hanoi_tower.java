package Recursive;
import java.util.Scanner;

public class hanoi_tower {
	static void move(int no, int x, int y) {
		if(no>1)
			move(no-1, x, 6-x-y);
		
		System.out.println("move discus "+no+"th "+x+" to "+y);
		if(no>1)
			move(no-1, 6-x-y,y);
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Hanoi Tower");
		System.out.println("number of discus : ");
		int n=scanner.nextInt();
		
		move(n,1,3);
		
	}
}
