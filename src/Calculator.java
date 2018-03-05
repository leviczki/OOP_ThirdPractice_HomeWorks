import java.io.IOException;
import java.util.Scanner;

public class Calculator {
	
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Program: 4 alap műveletet ismerő kalkulátor.");
		
		Scanner input_1 = new Scanner(System.in);
		
		do {
			System.out.print("Válassz:"
					+ "\n 1 - Enterrel elválasztva írod be a számokat és az operátort."
					+ "\n 2 - Szóközzel elválasztva írod be. (pl.: 5 + 2)"
					+ "\n\n Választásod: ");
		
			String choice = input_1.next();
		
			switch(choice) {
			
				case "1": {
					System.out.println("Eredmény: " + calculateWithThreeArgument());
					break;
				}
				
				case "2": {
					System.out.println("Eredmény: " + calculateWithOneArguments());
					break;
				}
				
				default:
					System.out.println("Hiba");
					break;
			}
		
		System.out.println("Szeretné folytatni a számolást?"
				+ "\n 0 - Nem"
				+ "\n 1 - Igen"
				+ "\n");
		
		} while(continuation(input_1.next()));
		
		input_1.close();
	}
	
	public static double calculateWithOneArguments() {
		System.out.print("Input: ");
		String calculation= new Scanner(System.in).nextLine();
		
		double firstNumber = Double.parseDouble(calculation.split(" ")[0]);
		String operator=calculation.split(" ")[1];
		double secNumber= Double.parseDouble(calculation.split(" ")[2]);
		
		
		return calculating(firstNumber, operator, secNumber);
	}
	
	public static double calculateWithThreeArgument() {
		System.out.print("Első szám: ");
		double firstNumber=new Scanner(System.in).nextDouble();
		
		System.out.print("Operátor: ");
		String operator=new Scanner(System.in).next();
		
		System.out.print("Második szám: ");
		double secNumber=new Scanner(System.in).nextDouble();

		return calculating(firstNumber, operator, secNumber);
	}
	
	public static boolean continuation(String x) {	
		boolean igen = false;
		
		if(x.equals("1"))
			igen = true;
		
		return igen;
		
	}
	public static double calculating(double firstNumber, String operator, double secNumber)	{

		switch(operator)
		{
			case "+": 	return(int)(firstNumber+secNumber);
			
			case "-": 	return(int)(firstNumber-secNumber);
			
			case "*": 	return(int)(firstNumber*secNumber);
			
			case "/":
						if(secNumber != 0)
							return(firstNumber/secNumber);
						else 
							System.out.println("0 az osztó!");
		}
		
		System.out.println("Baj van teso");
		return Double.NaN;
	}
}