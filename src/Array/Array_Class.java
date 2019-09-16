package Array;
import java.util.Scanner;

public class Array_Class {
	static final int VMAX=21; // 0.0 to 2.1
	static class PhysicalData{
		String name;
		int height;
		double cision;
		double vision;
		
		PhysicalData(String anme, int height, double vision){
			this.name=name;
			this.height=height;
			this.vision=vision;
		}
	}
	
	static double avgHeight(PhysicalData[] dat) {
		double sum=0;
		
		for(int i=0;i<dat.length;i++)
			sum+=dat[i].height;
		
		return sum/dat.length;
	}
	
	static void distiributionVision(PhysicalData[] dat, int[] dist) {
		int i=0;
		dist[i] =0;
		for(i=0;i<dat.length;i++)
			if(dat[i].vision>=0.0 && dat[i].vision<=VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		PhysicalData[] x= {
				new PhysicalData("Lee_MyungBack",170,1.1),
				new PhysicalData("Park_Geunhye",160,0.1),
				new PhysicalData("Hwuang_Kyoan", 170,0.6),
				new PhysicalData("Kim_Sengtae",175,0.2),
				new PhysicalData("Na_Kyungwon",160,0.4),
		};
		
		int[] vdist= new int[VMAX];
		System.out.println("list of body check");
		System.out.println("name              height     eyesight");
		System.out.println("--------------------------------------");
		for(int i=0;i<x.length;i++)
			System.out.printf("%s   %d   %f\n", x[i].name,x[i].height,x[i].vision);
		
		System.out.printf("\n average height: %5.1f cm\n",avgHeight(x));
		
		distiributionVision(x,vdist);
		
		System.out.println("distribution of eyesight");
		for(int i=0;i<VMAX;i++)
			System.out.printf("%3.1f~ : %2d \n",i/10.0,vdist[i]);
		
	}
}
