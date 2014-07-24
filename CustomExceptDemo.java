//Creating Exception Subclasses
//create an exception
class NonIntResultException extends Exception {
	int n;
	int d;
	
	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}
	
	public String toString() {
		return "Result of " + n + " / " + d + " is non-integer.";
	}
}

class CustomExceptDemo {
	public static void main(String args[]) {
		//Here, numer contains some odd values
		int numerator[] = { 4, 8, 16, 32, 64, 128, 512 };
		int denominator[] = { 2, 0, 4, 4, 0, 8 };
		
		for( int i = 0; i < numerator.length; i++ ) {
			try {
				if((numerator[i] % 2) != 0)
					throw new NonIntResultException(numerator[i], denominator[i] );
					System.out.println(numerator[i] + " / " + denominator[i] + " is " + (numerator[i]/denominator[i]));
			}
			catch(ArithmeticException exc) {
				System.out.println("Can't divide by zero!");
			}
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("No matching element found.");
			}
			catch(NonIntResultException exc) {
				System.out.println(exc);
			}
		}
	}
}
