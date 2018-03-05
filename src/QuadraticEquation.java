import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		System.out.println("Program: Másodfokú egyenletet fogok megoldani.");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Válassz:"
						+ "\n 1 - Enterrel elválasztva írod be a számokat."
						+ "\n 2 - Vesszővel elválasztva írod be. (pl.: 5,-3,-2)"
						+ "\n\n Választásod: ");
		
		double a = 0, b = 0, c = 0;
		
		switch(input.nextInt()) {
			
			case 1: {
				System.out.print("a: ");
				a = input.nextDouble();
				aZero(a);
				
				System.out.print("b: ");
				b = input.nextDouble();
				
				System.out.print("c: ");
				c = input.nextDouble();
				
				calculateAndPrint(a, b, c);
				break;
			}
			case 2: {
				System.out.print("Input: ");
				String line = input.next();

				a = Double.parseDouble(line.split(",")[0]);
				aZero(a);
				b = Double.parseDouble(line.split(",")[1]);
				c = Double.parseDouble(line.split(",")[2]);
				
				calculateAndPrint(a, b, c);
				break;
			}
			default: {
				System.out.println("Hiba a választás során.");
				break;
			}
		}
		
		input.close();
		
	}
	
	public static double discriminant(double a, double b, double c) {
		return Math.sqrt(Math.pow(b, 2)-(4*a*c));
	}
	public static void aZero(double a) {
		if(a == 0.0) {
			System.out.println("Az \"a\" nem lehet 0. Program vége.");
			System.exit(-1);
		}
	}
	public static void calculateAndPrint(double a, double b, double c) {
		double discriminant_var = discriminant(a, b, c);
		
		if(discriminant_var == Double.NaN) {
			System.out.println("A diszkrimináns kisebb, mint 0. Program vége.");
			System.exit(-1);
		}
		
		b *= -1.0;
		
		System.out.println( (b+discriminant_var)/(2*a) );
		System.out.println( (b-discriminant_var)/(2*a) );
	}
}
