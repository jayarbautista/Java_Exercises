//command-line arguments demo
class CLDemo {
	public static void main(String args[]) {
		System.out.println("There are " + args.length + " command-line arguments.");
		
		System.out.println("They are: ");
		for( int i = 0; i < args.length; i++ )
			System.out.println("arg[" + i + "]: " + args[i]);
			
		//char ch;
		//for( int i = 0; i < 10; i++ )
		//	System.out.println((char)('A'+i)+""+(char)('a'+i));
	}
}
