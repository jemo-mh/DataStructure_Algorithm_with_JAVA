package FindMaximum;
import java.util.Scanner;
public class Three_Component_Maximum_01 {
	
	
	static int max3func(int a, int b, int c)
	{
		int max=a; 
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
	//make new method(function) to finding maximum value with three integer
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);
		boolean ex = false;
		while(ex) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			System.out.println("the maximum value is  " + max3func(a,b,c));
			boolean exit= scanner.nextBoolean();
			if(exit==true)
				ex=true;
		}		
		*/
		System.out.println(max3func(3,2,1));
		
		
	}

}
