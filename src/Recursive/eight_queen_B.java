package Recursive;

public class eight_queen_B {
	/*
	 * print out
	 *  OOOOOOOO		XXXXXXXX
	 *  XXXXXXXX		XXXXXXXX
	 *  XXXXXXXX		XXXXXXXX
	 *  XXXXXXXX    to  XXXXXXXX  
	 *  XXXXXXXX		XXXXXXXX
	 *  XXXXXXXX		XXXXXXXX
	 *  XXXXXXXX		XXXXXXXX
	 *  XXXXXXXX 		OOOOOOOO
	 */
	static int[] pos= new int[8];
	
	static void print() {
		for(int i=0;i<8;i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0;j<8;j++) {
			pos[i]=j;
			if(i==7)
				print();
			else
				set(i+1);
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
