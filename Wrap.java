//Boxing and unboxing with a type wrapper
class Wrap {
	public static void main(String args[]) {
		Integer iOb = new Integer(100); //boxing
		
		int i = iOb.intValue(); //unboxing
		
		System.out.println(i + " " + iOb);
	}
}
