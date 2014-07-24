//demo for arithmetic exception handling
class ExcDemo3 {
	public static void main(String args[]) {
		int numerator[] = { 4, 8, 16, 32, 64, 128 };
		int denominator[] = { 2, 0, 4, 4, 0, 8 };
		
		for ( int i = 0; i < numerator.length; i++ ) {
			try {
				System.out.println(numerator[i] + " / " + denominator[i] + " is " + (numerator[i]/denominator[i]));
			}
			catch(ArithmeticException exc) {
				System.out.println("Can't divide by zero!");
			}
		}
	}
}
