package Array;
import java.util.Scanner;

public class Array_2D_Count_Day {
	static int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	static int isLeap(int year) {
		return (year%4 ==0 &&year%100 !=0 || year%400 ==0)?1:0;	
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days=d;
		for(int i=1;i<m;i++)
			days+=mdays[isLeap(y)][i-1];
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("year : ");
			int year= scanner.nextInt();
			System.out.print("month : ");
			int month=scanner.nextInt();
			System.out.print("day : ");
			int day= scanner.nextInt();
			
			System.out.printf("it is %d th day with that year\n", dayOfYear(year,month,day));
			System.out.println("retry?(1.yes / 2.no)");
			retry= scanner.nextInt();
		}while(retry==1);
	}
}
