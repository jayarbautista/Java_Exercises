//Bitwise operator
//Use XOP to encode and decode a message
class Encode {
	public static void main(String args[]) {
		String msg = "This is me, from somewhere with no one.";
		String encmsg = "";
		String decmsg = "";
		int key = 24;
		
		System.out.println("Original Message: " + msg);
		
		//encode the message
		for ( int i = 0; i < msg.length(); i++ )
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
			
		System.out.println("Encoded message: " + encmsg);
		
		//decode the message
		for ( int i = 0; i < msg.length(); i++ )
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
			
		System.out.println("Decoded message: " + decmsg);
	}
}
