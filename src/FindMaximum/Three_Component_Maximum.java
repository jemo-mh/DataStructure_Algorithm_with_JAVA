/*
 * Input three integer to find maximum value
 */
package FindMaximum;
import java.util.Scanner; //input library

public class Three_Component_Maximum {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); // input func
		
		System.out.println("Find Maximum value  : ");
		System.out.println("A value : ");
		int a = scanner.nextInt();
		System.out.println("B value : ");
		int b = scanner.nextInt();
		System.out.println("C value : ");
		int c = scanner.nextInt();
		
		int max= a; // let a to be maximum value
		if(b>max)  //if max(=a) is smaller than b, then  let b to be maximum value and so on
			max=b;
		if(c>max)
			max=c;
		System.out.println("The maximum value is "+max);
		
	}
}
/*
* The input Method
* 	 method				   data type				  range
* 	nextBoolean() 			boolean					true ||false
* 	nextByte()				byte					(-128,127)
* 	nextShort()				short					(-32768,32767)
* 	nextLong()				long
* 	nextFloat()				float
* 	nextDouble()			double
* 	next() 					String					String (distinguish space or line)
* 	nextLine()				String					one line of String 
*
*/