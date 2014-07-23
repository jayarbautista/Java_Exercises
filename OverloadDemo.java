//Demonstration of method overloading
class Overload {
	
	void ovlDemo() {
		System.out.println("No parameters");
	}
	
	//Overload ovlDemo for one integer parameter
	int ovlDemo(int a) {
		System.out.println("One parameter: " + a);
		return a;
	}
	
	//Overload ovlDemo for two integer parameter
	int ovlDemo(int a, int b) {
		System.out.println("Two parameter: " + a + ", " + b);
		return a + b;
	}
	
	//Overload ovlDemo for two double parameter
	double ovlDemo(double a, double b) {
		System.out.println("Two double parameter: " + a + ", " + b);
		return a + b;
	}
}

class OverloadDemo {
	public static void main(String args[]) {
		Overload ob = new Overload();
		int resI;
		double resD;
		
		//call all versions of ovlDemo()
		ob.ovlDemo();
		ob.ovlDemo(24);
		ob.ovlDemo(24,27);
		ob.ovlDemo(1.1, 2.47);
		
		resI = ob.ovlDemo(24,27);
		System.out.println("Result is: " + resI);
	}
}
