package Array;
import java.util.Scanner;

public class String_Convert {
	static int cardConvR(int x, int r, char[] d)
	{
		int digit=0;
		String dchar= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digit++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digit;
	}
	
	public static void amin(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("십진수를 기수로  변환");
		
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no= scanner.nextInt();
				
			}while(no<0);
			
			do {
				System.out.print("변환하고자 하는 진수 수 (2~36)");
				cd = scanner.nextInt();
				
			}while(cd<2||cd>36);
			dno= cardConvR(no,cd,cno);
			System.out.println(cd+"진수로는 : ");
			for(int i =dno-1;i>=0;i--)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.println("retry ?(1 : yes/ 2: no");
			retry= scanner.nextInt();
			
		}while(retry==1);
	}
}
