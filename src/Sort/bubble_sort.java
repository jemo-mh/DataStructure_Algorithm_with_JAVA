package Sort;
import java.util.Scanner;

//Time complexity is O(n^2)

public class bubble_sort {
	static void swap(int[] a, int index1, int index2) {
		int temp=a[index1];
		a[index1]=a[index2];
		a[index2]= temp;
	}

	static void bubblesort(int[] a, int n) {
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--)
				if(a[j-1]>a[j])
					swap(a,j-1,j);
		}
	}
	
	static void bubblesort_01(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			int exchange=0;
			for(int j=n-1;j>i;j--)
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					exchange++;
				}
			if(exchange ==0)
				break;
		}
	}
		
	static void dbubblesort_02(int[] a, int n) {
		int k=0;
		while(k<n-1) {
			int lastcomponent=n-1;
			for(int j=n-1;j>k;j--)
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					lastcomponent=j;
				}
			k=lastcomponent;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Bubble sort : ");
		System.out.println("number of component :");
		int nx = scanner.nextInt();
		int[] x= new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scanner.nextInt();
		}
		bubblesort(x,nx);
		System.out.println("ordered by ascending sort");
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"] :"+x[i]);
	}
}	
