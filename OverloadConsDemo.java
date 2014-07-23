//Demo for constructor overloading
class MyClass {
	int x;
	
	MyClass() {
		System.out.println("Inside MyClass().");
		x = 0;
	}
	
	MyClass( int i ) {
		System.out.println("Iside MyClass(int).");
		x = i;
	}
	
	MyClass( double d ) {
		System.out.println("Inside MyClass(double).");
		x = (int)d;
	}
	
	MyClass(int i, int j) {
		System.out.println("Inside MyClass(int, int)");
		x = i * j;
	}
}

class OverloadConsDemo {
	public static void main(String args[]) {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(24);
		MyClass mc3 = new MyClass(2.29);
		MyClass mc4 = new MyClass(24, 27);
		
		System.out.println("Samle #1: " + mc1.x);
		System.out.println("Samle #2: " + mc2.x);
		System.out.println("Samle #3: " + mc3.x);
		System.out.println("Samle #4: " + mc4.x);
	}
}
