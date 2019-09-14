package Array;
import java.util.Scanner;
public class Array_Compare {
	static boolean equals(int [] a, int[] b) {
		if(a.length!=b.length)
			return false;
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("length of array a");
		int numA=scanner.nextInt();
		System.out.println("length of array b");
		int numB=scanner.nextInt();
		
		
		int[] a= new int[numA];
		int[] b= new int[numB];
		
		System.out.println("input array a");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]= ");
			a[i]=scanner.nextInt();
		}
		System.out.println("input array b");
		for(int i=0;i<b.length;i++)
		{
			System.out.print("b["+i+"]= ");
			b[i]=scanner.nextInt();
		}
		
	
		
	/*	System.out.println("length of array a");
		int numA=scanner.nextInt();
		int[] a= new int[numA];
		System.out.println("input array a");
		for(int i=0;i<numA;i++)
		{
			System.out.print("a["+i+"]= ");
			a[i]=scanner.nextInt();
		}
		
		System.out.println("length of array b");
		int numB=scanner.nextInt();
		int[] b= new int[numB];
		System.out.println("input array b");
		for(int i=0;i<b.length;i++)
		{
			System.out.print("b["+i+"]= ");
			b[i]=scanner.nextInt();
		}
		*/
		
		if(equals(a,b)==true)
			System.out.println("same");
		else if(equals(a,b)==false)
			System.out.println("not same");
		
	}
} 
