package Sort;
import java.util.Scanner;

//Time complexity is O(n^2)
public class straight_insertion_sort {

	static void insertionsort(int[] a, int n) {
		for(int i=1;i<n;i++) {
			int j;
			int temp=a[i];
			
			for(j=i;j>0 && a[j-1]>temp;j--)
				a[j]=a[j-1];
			a[j]=temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Staight insertion sort : ");
		System.out.println("number of component :");
		int nx = scanner.nextInt();
		int[] x= new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scanner.nextInt();
		}
		insertionsort(x,nx);
		System.out.println("ordered by ascending sort");
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"] :"+x[i]);
	}
}
