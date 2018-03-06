
public class ArraysClass {
	public static void main(String[] args) {
		
	
		int[] myIntArray = {6, 12, 65, 22, 1, 59, 62};
		double[] myDoubleArray = {6.9, 7.1, 1.5, 2.9, 35.67, 99.99, 3.33};
		char[] myCharArray = {'z', 'c', 'h', 'g', 'a', 'w', 'f'};
	
		//myIntArray
		for(int x:myIntArray)
			System.out.print(x + " ");
		System.out.println();
		
		System.out.println("java.util.Arrays.sort(myIntArray);");
		
		java.util.Arrays.sort(myIntArray);
			
		for(int x:myIntArray)
			System.out.print(x + " ");
		System.out.println();
			
		int int_search = 6;
		System.out.println("java.util.Arrays.binarySearch(myIntArray, "+ int_search +");");
			System.out.println("Index: " + java.util.Arrays.binarySearch(myIntArray, int_search)+"\n\n");
			
		//myDoubleArray
		for(double x:myDoubleArray)
			System.out.print(x + " ");
		System.out.println();
		
		System.out.println("java.util.Arrays.sort(myDoubleArray): ");
		
		java.util.Arrays.sort(myDoubleArray);
		for(double x:myDoubleArray)
			System.out.print(x + " ");
		System.out.println();
		
		double double_search = 3.33;
		System.out.println("java.util.Arrays.binarySearch(myDoubleArray, "+ double_search +");");
			System.out.println("Index: " + java.util.Arrays.binarySearch(myDoubleArray, double_search)+"\n\n");
			
		
		//myCharArray
		for(char x:myCharArray)
			System.out.print(x + " ");
		System.out.println();
		
		System.out.println("java.util.Arrays.sort(myCharArray): ");//char
		
		java.util.Arrays.sort(myCharArray);
		
		for(char x:myCharArray)
			System.out.print(x + " ");
		System.out.println();
			
		char char_search = 'w';
			System.out.println("java.util.Arrays.binarySearch(myCharArray, "+ char_search +");");
				System.out.println("Index: " + java.util.Arrays.binarySearch(myCharArray, char_search)+"\n\n");
				
		//java.util.Arrays.equals(array1, array2);
		System.out.println("java.util.Arrays.equals(myIntArray, myIntArray);");
		System.out.println("Output: " + java.util.Arrays.equals(myIntArray, myIntArray));
		
		int[] myIntArray_2 = {6, 12, 65, 22, 1, 59, 62}; //Ugyan azok az elemek, egyik rendezett másik nem és false kimenet
		System.out.println("java.util.Arrays.equals(myIntArray, myIntArray_2);");
		System.out.println("Output: " + java.util.Arrays.equals(myIntArray, myIntArray_2));
		//Program vége
	}
}
