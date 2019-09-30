package Search;
import java.util.Scanner;

public class liner_search {
	static int liner_search(int[] a, int n, int key) {
		int i=0;
		while(true) {
			if(i==n)
				return -1; // searching fail
			if(a[i]==key)
				return i;//searching success, return key 
			i++;
		}
	}
	static int liner_search_with_for(int[] a, int n, int key) {
		for(int i =0; i<a.length; i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("number of component : ");
		int num= scanner.nextInt();
		int[] x= new int[num]; // make an array that size num
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]: ");
			x[i]=scanner.nextInt();
		}
		System.out.print("input a number u want to search");
		int key= scanner.nextInt();
		int index = liner_search(x,num, key);
		if(index==-1)
			System.out.println("can't find the number");
		else
			System.out.println("the number "+key+" is in x["+index+"]");
		//--------------------------------------------------------------------------
		System.out.print("number of component : ");
		int num1= scanner.nextInt();
		int[] x1= new int[num1];
		for(int i=0;i<num1;i++) {
			System.out.print("x["+i+"]: ");
			x1[i]=scanner.nextInt();
		}
		System.out.print("input a number u want to search");
		int key1= scanner.nextInt();
		int index_for=liner_search_with_for(x1,num1,key1);
		if(index_for==-1)
			System.out.println("can't find the number");
		else
			System.out.println("the number "+key1+" is in x["+index_for+"]");
	}
}
