//Autoboxing/auto-unboxing and methods
//with parameters and return values
class AutoBox2 {
	//with integer parameter
	static void m(Integer v) {
		System.out.println("m() received " + v);
	}
	
	//returns an int
	static int m2() {
		return 10;
	}
	
	//returns an Integer
	static Integer m3() {
		return 24;
	}
	
	public static void main(String args[]) {
		m(29);
		
		Integer iOb = m2();
		System.out.println("Return value from m2() is " + iOb);
		
		int i = m3();
		System.out.println("Return value from m3() is " + i);
		
		iOb = 100;
		System.out.println("iOb is now " + iOb);
		System.out.println("Square root of iOb is " + Math.sqrt(iOb));
	}
}
