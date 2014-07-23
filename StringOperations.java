//Some string operations demo
class StringOperations {
	public static void main(String args[]) {
		String str1 = "Hello World!";
		String str2 = new String(str1);
		String str3 = "This is Java.";
		int result, idx;
		char ch;
		
		//length of the string
		System.out.println("Length of str1: " + str1.length());
		
		//displays the the string one character at a time
		for (int i = 0; i < str1.length(); i++)
			System.out.println(str1.charAt(i));
			
		result = str1.compareTo(str3);
		if(result == 0)
			System.out.println("str1 and sr3 are equal");
		else if( result > 0 )
			System.out.println("str1 is greater than str3");
		else
			System.out.println("str1 is less than str3");
			
		str2 = "Java , Hello World World Hello , Java";
		
		idx = str2.indexOf("World");
		System.out.println("Index of World is: " + idx);
		
		idx = str2.lastIndexOf("Hello");
		System.out.println("Index of last occurence of the word Hello is : " + idx);
		
		System.out.println("Substring of 3 to 10: " + str1.substring(3,10));
	}
}
