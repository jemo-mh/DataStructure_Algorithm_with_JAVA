package Search;
import java.util.Arrays;
import java.util.Scanner;

public class binary_search_api {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("number of component");
		int num= scanner.nextInt();
		int[] x= new int[num];
		
		System.out.println("input number in order");
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
		int index=Arrays.binarySearch(x, key);
		
		if(index==-1)
			System.out.println("searching failed");
		else
			System.out.println("the value "+key+"is in x["+index+"]");
	}

}
