package Search;
import java.util.Scanner;
public class liner_search_sentinel_method {
		
	static int  iner_search_sentinel_method(int[] a, int n, int key){
		int i=0;
		while(true) {
			if(a[i]==key)
				break; //sentinel method
			i++;
		}
		return i==n ? -1 : i; // if i==n  than return -1 . if not, than return i
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input the number of component");
		int num= scanner.nextInt();
		int[] x = new int[num+1];
		
		for( int i =0;i<x.length;i++) {
			System.out.print("x["+i+"]: ");
			x[i]= scanner.nextInt();
		}
		
		System.out.print("input a number u want to search : " );
		int key= scanner.nextInt();
		int index= iner_search_sentinel_method(x, num,key);
		if(index==-1)
			System.out.println("can't find the number");
		else
			System.out.println("the number "+key+" is in x["+index+"]");
	}

}
