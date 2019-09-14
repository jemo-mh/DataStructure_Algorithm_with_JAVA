package Array;
import java.util.Scanner;

public class Array_Find_Max {
	static int maximumArray(int[] a) {  //create method to figure out maximum value in this array
		int maximum=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>maximum)
				maximum=a[i];
		}
		return maximum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Find maximum value in the array");
		System.out.println("number : ");
		int num= scanner.nextInt();
		
		int[] score = new int[num]; //create array that exsist num's components 
		for(int i=0;i<num;i++) {
			System.out.print("score["+i+"]= ");
			score[i] = scanner.nextInt();
		}
		
		System.out.println("the maximum value is "+maximumArray(score));
	}

}
