package Repetitive_Statement;

public class for_prime_number {
	public static void main(String[] args) {
		int count=0;
		for(int n=2;n<500;n++) { //range of n  : (2,500)
			int i;
			for(i=2;i<n;i++)
			{
				count++;
				if(n%i==0) //if n%i==0, than no need to continue, go to next number
					break;
			}
			if(n==i)
				System.out.println(n);
		}
		System.out.println("count of division : "+count);
	}
}
