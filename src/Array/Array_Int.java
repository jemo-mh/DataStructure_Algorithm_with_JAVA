package Array;

public class Array_Int {
	public static void main(String[] args)
	{
		int[] a = new int [5]; // define array a that contains 5 component
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]=" + a[i]);
		}
	}
}
