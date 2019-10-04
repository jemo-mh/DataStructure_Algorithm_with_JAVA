package Queue;
import java.util.Scanner;

public class ringbuffer_application {
	/*
	 * ring buffer can be used for throwing out old data. 
	 */
	
	
	public static void mian(String[] args) {
		Scanner scanner= new Scanner(System.in);
		final int N=10;
		int[] a =new int [N];
		int cnt=0;
		int retry;
		
		System.out.println("input the number");
		do {
			System.out.printf("%dth number : ",cnt+1);
			a[cnt++ %N]=scanner.nextInt();
			
			System.out.print("u wanna try again? (1. yes/ 2. no) ");
			retry=scanner.nextInt();
		}while(retry==1);
		
		int i=cnt-N;
		if(i<0)
			i=0;
		for(;i<cnt;i++)
			System.out.printf("%2dth number = %d\n", i+1,a[i%N]);
	}
	

}
