package Array;

public class Array_Clone {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b = a.clone(); //clone the array a
		
		System.out.print("array a : ");
		for(int i=0;i<a.length;i++)
			System.out.print("a["+i+"] = "+ a[i] +",   ");
		System.out.println();
		
		System.out.print("array b : ");
		for(int i=0;i<b.length;i++)
			System.out.print("b["+i+"] = "+ b[i] +",   ");
		System.out.println();
		System.out.println(" change b[2] to 999");
		
		b[2]=999;
		System.out.print("array b : ");
		for(int i=0;i<b.length;i++)
			System.out.print("b["+i+"] = "+ b[i] +",   ");
		System.out.println();
		
	}
}
