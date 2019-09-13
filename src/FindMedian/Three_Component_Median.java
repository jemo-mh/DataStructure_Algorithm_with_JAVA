package FindMedian;
import java.util.Scanner;
public class Three_Component_Median {
	static int med3func(int a, int b, int c)
	{
		int median;
		if(a >=b)
			if(b>=c) // if a is bigger than b, and b is bigger than c, then median value is b
				median=b;
			else if(a<=c) //if a is bigger tha b, and c is bigger than a, than median value is a
				median=a;
			else
				median=c;
		else if(a>c)
			median=a;
		else if(b>c)
			median=c;
		else 
			median=b;
		return median;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Find median value with three integer");
		System.out.println("intput three integer a,b,c");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("The median value is " + med3func(a,b,c));
		
		
	}

}
