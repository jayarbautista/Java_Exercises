/*A simple Generic class
 * Here, T is a type parameter that
 * will be replaced by a real type
 * when an object of type Gen is created
*/

class Gen<T> {
	T ob; //declare an object of type T
	
	//Pass the constructor a reference to an object of type T.
	Gen(T o) {
		ob = o;
	}
	
	//return ob;
	T getOb() {
		return ob;
	}
	
	//show type of T
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

//Demonstrate the generic class
class GenDemo {
	public static void main(String args[]) {
		//Create a Gen reference for integers
		Gen<Integer> iOb;
		
		//Create a Gen<Integer> object and assign its
		//reference to iOb. Notice the use of autoboxing
		//to encapsulate the value 88 within an Integer object.
		iOb = new Gen<Integer>(88);
		
		//Show the type of data used by iOb.
		iOb.showType();
		
		//Get the value of iOb
		int v = iOb.getOb();
		System.out.println("Value: " + v);
		
		System.out.println("");
		
		Gen<String> sOb;
		
		sOb = new Gen<String>("Hello World!");
		
		sOb.showType();
		String s = sOb.getOb();
		System.out.println("Value: " + s);
	}
}
