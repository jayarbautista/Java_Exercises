//demo a raw type
class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
}

class RawDemo {
	public static void main(String args[]) {
		
		//create a Gen object for integers.
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		//for Strings
		Gen<String> sOb = new Gen<String>("Hello!");
		
		//create a raw type gen object and give in a double value
		Gen raw = new Gen(new Double(98.6));
		
		double d = (Double)raw.getOb();
		System.out.println("Value: " + d);
		
		sOb = raw;
		raw = iOb;
	}
}
