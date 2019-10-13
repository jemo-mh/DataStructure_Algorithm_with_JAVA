package Sort;
import java.util.Scanner;

public class shell_sort {
	
	static void shellsort(int[] a, int n) {
		for(int shell =n/2 ; shell>0;shell/=2)
			for(int i=shell;i<n;i++) {
				int j;
				int temp=a[i];
				for(j=i-shell;j>=0 && a[j]>temp;j-=shell)
					a[j+shell]=a[j];
				a[j+shell]=temp;
			}
	}
	
	public static void mian(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Shell sort :");
		System.out.println("number of component :");
		int nx= scanner.nextInt();
		int[] x= new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scanner.nextInt();
		}
		
		shellsort(x,nx);
		System.out.println("ordered by ascending sort");
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"] :"+x[i]);
		
	}
}
