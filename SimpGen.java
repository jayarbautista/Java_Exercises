//A simple generic class with two parameters

class Gen<T, V> {
	T ob1;
	V ob2;
	
	Gen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	void showType() {
		System.out.println("Type of T is " + ob1.getClass().getName());
		System.out.println("Type of V is " + ob2.getClass().getName());
	}
	
	T getOb1() {
		return ob1;
	}
	
	V getOb2() {
		return ob2;
	}
}

class SimpGen {
	public static void main(String args[]) {
		Gen<Integer, String> ob = new Gen<Integer, String>(247, "ABCDE");
		
		ob.showType();
		System.out.println("Value of T is: " + ob.getOb1());
		System.out.println("Value of V is: " + ob.getOb2());
	}
}
