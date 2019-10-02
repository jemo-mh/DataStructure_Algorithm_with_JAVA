package Search;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class binary_search_application {

	static class Data{
		private String name;
		private int height;
		private double vision;
		
		public Data(String name, int height, double vision) { //creator
			this.name=name;
			this.height= height;
			this.vision=vision; 
		}
		
		public String toString() { //method for checking information, return string
			return name+" "+height+" "+vision;
		}
		public static final Comparator<Data> HeightOrder = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<Data>{
			public int compare(Data data1, Data data2) {
				return(data1.height>data2.height) ? 1 : (data1.height<data2.height) ? -1 : 0;
			}
		}	
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Data[] x= {
				new Data("lee myungbak", 170,0.5),
				new Data("park geunnhye",160,0.4),
				new Data("kim sungtae",171,0.6),
				new Data("Na bae",162,0.3),
				
		};
		
		System.out.print("who are u looking for? how tall is he(or she)");
		int height= scanner.nextInt();
		int index= Arrays.binarySearch(x, new Data("",height,0.0),Data.HeightOrder);
		
		if(index<0)
			System.out.println("Searching failed");
		else {
			System.out.println("the data is in x["+index+"]" );
			System.out.println("searched data : "+x[index]);
		}
	}
}
