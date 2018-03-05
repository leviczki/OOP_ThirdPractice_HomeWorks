import java.util.Scanner;

public class GeometricMean {
	public static void main(String[] args) {
		System.out.println("Program: 10 valós számot kérek és kiszámolom a mértani átlagukat. (pl.: 5.3)\n");
		
		double[] myArray = new double[10];
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		
		while(i < myArray.length) {
			System.out.print("Kérem a "+(i+1)+". valós számot: ");
			myArray[i] = input.nextDouble();
			i++;				
		}
		
		System.out.println("\nA mértani átlaga a számoknak: "+geometricMeanCalculator(myArray));
		
		input.close();
	}
	
	public static double geometricMeanCalculator(double[] myArray) {
		double result = 1;
		
		for(double x:myArray)
			result *= x;
		
		return Math.pow(result, 1.0/myArray.length);
	}

}
