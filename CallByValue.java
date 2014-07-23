// primitive types are passed by value
class Test {
	int a, b;
	
	void noChange(int i, int j) {
		i += j;
		j = -j;
	}
	
	Test(int i, int j) {
		a = i;
		b = j;
	}
	
	void Change(Test ob) {
		ob.a += ob.b;
		ob.b = -ob.b;
	}
}

class CallByValue {
	public static void main(String args[]) {
		Test ob = new Test(24,27);
		
		int a = 24, b = 27;
		
		System.out.println("a and b before call: " + a + ", " + b);
		
		ob.noChange(a,b);
		
		System.out.println("a and b after call: " + a + ", " + b);
		
		
		Test obj = new Test(24, 27);
		
		System.out.println("\n\na and b before call: " + obj.a + ", " + obj.b);
		
		obj.Change(obj);
		
		System.out.println("a and b after call: " + obj.a + ", " + obj.b);
	}
}
