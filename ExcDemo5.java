//Subclasses must precede superclasses in catch statement
class ExcDemo5 {
	public static void main(String args[]) {
		int numerator[] = { 4, 8, 16, 32, 64, 128, 512 };
		int denominator[] = { 2, 0, 4, 4, 0, 8 };
		
		for ( int i = 0; i < numerator.length; i++ ) {
			try {
				System.out.println(numerator[i] + " / " + denominator[i] + " is " + (numerator[i]/denominator[i]));
			}
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("No matching element found.");
			}
			catch(Throwable exc) {
				System.out.println("Some exception occured.");
			}
		}
	}
}
