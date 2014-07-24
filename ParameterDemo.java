//Simple example showing parameters in a method
class CheckNum {
	//return true if x is even
	
	boolean isEven(int x) {
		if((x%2) == 0)
			return true;
		else
			return false;
	}
}

class Factor {
	boolean isFactor(int a, int b) {
		if((b%a) == 0)
			return true;
		else
			return false;
	}
}

class ParameterDemo {
	public static void main(String args[]) {
		CheckNum check = new CheckNum();
		Factor fact = new Factor();
		
		if (check.isEven(24))
			System.out.println("24 is even");
		if (check.isEven(29))
			System.out.println("29 is even");
		if (check.isEven(18))
			System.out.println("18 is even");
			
		if(fact.isFactor(2, 20))
			System.out.println("2 is factor");
		if(fact.isFactor(3, 20))
			System.out.println("3 is factor");
	}
}
