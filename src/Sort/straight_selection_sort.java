package Sort;
import java.util.Scanner;

//Time complexity is O(n^2)
public class straight_selection_sort {
	
	static void swap(int[] a, int index1, int index2) {
		int temp=a[index1];
		a[index1]=a[index2];
		a[index2]= temp;
	}
	
	static void selectionsort(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++)
				if(a[j]<a[min])
					min=j;
			swap(a,i,min);
		}
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Straight selection sort : ");
		System.out.println("number of component :");
		int nx = scanner.nextInt();
		int[] x= new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scanner.nextInt();
		}
		selectionsort(x,nx);
		System.out.println("ordered by ascending sort");
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"] :"+x[i]);
	}
}
