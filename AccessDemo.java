//Public and Private access
class MyClass {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha( int a ) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
}

class AccessDemo {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		ob.setAlpha(24);
		System.out.println("ob.alpha is: " + ob.getAlpha()); 
		ob.beta = 27;
		ob.gamma = 29;
		System.out.println("ob.beta is: " + ob.beta);
		System.out.println("ob.gamma is: " + ob.gamma);
	}
}
