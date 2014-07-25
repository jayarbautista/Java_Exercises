//Autoboxing/auto-unboxing inside expressions
class AutoBox3 {
	public static void main(String args[]) {
		Integer iOb1, iOb2;
		int i;
		
		iOb1 = 99;
		System.out.println("Original value of iOb1: " + iOb1);
		
		iOb1++;
		System.out.println("After iOb1 increments 1: " + iOb1);
		
		iOb1 += 10;
		System.out.println("After iOb1 += 10: " + iOb1);
		
		iOb2 = iOb1 + (iOb1 / 3);
		System.out.println("iOb2 after expression: " + iOb2);
		
		i = iOb1 + (iOb1 / 3);
		System.out.println("i after expression: " + i);
	}
}
