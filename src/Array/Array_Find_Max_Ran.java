package Array;
import java.util.Scanner;
import java.util.Random;

public class Array_Find_Max_Ran {
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
		
		Random random= new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("find a maximum value of the array");
		System.out.print("number : ");
		int num= scanner.nextInt();
		
		int[] score = new int[num];
		System.out.println("the keys are :");
		for(int i=0;i<num;i++)
		{
			score[i]= random.nextInt(90);
			System.out.print("score["+ i+"]= "+score[i]+",   ");
			
		}
		System.out.println();
		System.out.println("the maximum value of this array is "+maximumArray(score));
		
	}
}
