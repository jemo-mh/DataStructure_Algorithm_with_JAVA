package Search;
import java.util.Scanner;

public class binary_search {
	static int binary_search(int[] a, int n, int key)
	{
		int pl=0; //first index of searching range
		int pr=n-1; //last index of searching range
		
		while(pl<=pr) {//repeat until pl is same of smaller than pr
			int pc=(pl+pr)/2; // index of middle component
			if(a[pc]==key)
				return pc;
			else if(a[pc]<key)
				pl=pc+1; // if key value is bigger than pc, than let first index change to pc+1 
			else if(a[pc]>key)
				pr=pc-1;
		}
		return -1; //searching fail
	}
	
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("number of component : ");
		int num=scanner.nextInt();
		int[] x = new int[num];
		System.out.println("input number in order"); //ascending sort
		System.out.print("x[0] :  "); //input first component
		x[0]=scanner.nextInt();
		for(int i=1;i<x.length;i++) {
			while(x[i]<x[i-1]) { //if x[i] is smaller than x[i], type again
				System.out.print("x["+i+"] : ");
				x[i]=scanner.nextInt();
			}
		}
		System.out.print("number u want to search : ");
		int key=scanner.nextInt();
		int index=binary_search(x,num,key);
		
		if(index==-1)
			System.out.println("searching failed");
		else
			System.out.println("the value "+key+"is in x["+index+"]");
	}
}
