package Array;
import java.util.Scanner;

public class Array_Reverse {
	static void swapArray(int[] a, int idx1, int idx2) {
		int t= a[idx1];
		a[idx1]= a[idx2];
		a[idx2]=t;
	}
	
	static void reverseArray(int[] a)
	{
		for (int i=0;i<a.length/2;i++) {
			swapArray(a,i,a.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("num : ");
		int num= scanner.nextInt();
		int[] x= new int[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.print("x["+i+"]= ");
			x[i]= scanner.nextInt();
			
		}
		System.out.println();
		System.out.println("the array of x is : ");
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]= "+x[i]+"  ");
		}
		reverseArray(x);
		
		System.out.println("the reverse array of x is : ");
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]= "+x[i]+"  ");
		}
	}

}
