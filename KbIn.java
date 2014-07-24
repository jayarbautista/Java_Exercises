//Read a character from a keyboard
class KbIn {
	public static void main(String args[]) throws java.io.IOException{
		char ch;
		
		System.out.print("Press a key then press ENTER: ");
		
		ch = (char) System.in.read(); // get a char
		
		System.out.println("You pressed: " + ch);
	}
}
