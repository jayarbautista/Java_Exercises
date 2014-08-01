//Casting Demonstration
class CastDemo {
	public static void main(String args[])
	{
		double x ,y;
		byte b;
		int i;
		char ch;
		
		x = 24.0;
		y = 5.0;
		
		i = (int)(x / y); //cast double to int
		System.out.println("Integer outcome of x / y: " + i);
		
		i = 500;
		b = (byte) i;
		System.out.println("Value of b: " + b);
		
		i = 257;
		b = (byte) i;
		System.out.println("Value of b: " + b);
		
		b = 88;
		ch = (char) b;
		System.out.println("ch: " + ch);
	}
}
