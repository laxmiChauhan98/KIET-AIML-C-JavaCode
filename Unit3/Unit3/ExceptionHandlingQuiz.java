package Unit3;

public class ExceptionHandlingQuiz {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		int value = 0;
		try {
			value = intArray[5];
			System.out.println(" : " + value);  // Line 1
		} 
                            catch (ArrayIndexOutOfBoundsException ec) {
			System.out.println("An exception has occurred"	+ ec); //Line 2
		} 
                            finally {      
			System.out.println("This is from with in the finally block"); // Line 3
		}
		System.out.println("This will be a part of response"); // Line 4
	}
}
