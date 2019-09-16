package Repetitive_Statement;

public class for_prime_number01 {
	public static void main(String[] args) {
		int count=0;  //count of division
		int ptr=0; 	  //number of prime num
		int[] prime = new int[500]; // array for prime num
		
		prime[ptr++]=2;  //2 is prime number
		for(int n=3;n<=500;n+=2) {
			int i;
			for(i=1;i<ptr;i++) {
				count++;
				if(n%prime[i]==0) //divide with prime number that we already found
					break;
			}
			if(ptr==i)
				prime[ptr++]=n; //if i is prime number, than save it
		}
		for(int i=0;i<ptr;i++)
			System.out.println(prime[i]);
		System.out.println("count of division : "+count);
	}
}
