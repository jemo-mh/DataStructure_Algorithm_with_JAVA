package Search;
import java.util.Arrays;
import java.util.Scanner;

public class binary_search_string {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String[] x= {
				"abstract","assert","boolean","break","byte",
				"case","catch","char","class","const",
				"continue","default","do","double","else",
				"enum","extends","final","finally","float",
				"for","goto","if","implements","import",
				"instanceof","int","interface","long","native",
				"new","package","private","protected","public",
				"return","short","static","strictfp","super",
				"switch","synchronized","this","throw","throws",
				"transient","try","void","volatile","while"
		};
		
		System.out.print("input keyward u want to find : ");
		String key= scanner.next();
		int index= Arrays.binarySearch(x, key);
		
		if(index<0)
			System.out.println("searching failed");
		else
			System.out.println("keyword '"+key+"' is in x["+index+"]");
	}

}
