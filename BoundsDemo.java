//Demo for bounded types

class NumericFns<T extends Number> {
	T num;
	
	NumericFns(T ob) {
		num = ob;
	}
	
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}

class BoundsDemo {
	public static void main(String args[]) {
		NumericFns<Integer> iOb = new NumericFns<Integer> (24);
		
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fraction of iOb is " + iOb.fraction());
		
		System.out.println();
		
		NumericFns<Double> ob2 = new NumericFns<Double>(24.7);
		
		System.out.println("Reciprocal of ob2 is " + ob2.reciprocal());
		System.out.println("Fraction of ob2 is " + ob2.fraction());
	}
}
