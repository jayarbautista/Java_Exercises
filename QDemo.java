class Queue {
	char q[]; //holds the queue
	int putloc, getloc; // put and get indices respectively
	int num[];
	
	Queue(int size) {
		q = new char[size+1]; //allocate memory for queue
		num = new int[size+1];
		putloc = getloc = 0;
	}
	
	//put a character into the queue
	void put(char ch) {
		if( putloc == q.length-1 ) {
			System.out.println(" -Queue is full");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	//get a character from the queue
	char get() {
		if( getloc == putloc ) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
	
	//put an int into the queue
	int put1(int number) {
		if( putloc == num.length-1 ) {
			System.out.println(" -Queue is full");
			return number;
		}
		putloc++;
		num[putloc] = number;
		return number;
	}
	
	//get an int from the queue
	int get1() {
		if( getloc == putloc ) {
			System.out.println(" - Queue is empty.");
			return 0;
		}
		getloc++;
		return num[getloc];
	}
}

class QDemo {
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ  =new Queue(4);
		Queue bigQ1 = new Queue(100);
		Queue smallQ1  =new Queue(4);
		char ch;
		int i;
		int number;
		
		System.out.println("Using bigQ to store the alphabet.");
		//put some numbers into bigQ
		for( i = 0; i < 26; i++ )
			bigQ.put((char)('A' + i));
			
		//retrieve and display elements from bigQ
		System.out.print("Contents of bigQ: ");
		for( i = 0; i < 26; i++ ) {
			ch = bigQ.get();
			if( ch != (char)0 )
				System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("USing smallQ to generate errors.");
		//now, use smallQ to generate some errors
		for( i = 0; i < 5; i++ ) {
			System.out.print("Attempting to store " + (char)('Z' - i));
			smallQ.put((char)('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		//more errors on smallQ
		System.out.print("Contents of smallQ: ");
		for( i = 0; i < 5; i++ ) {
			ch = smallQ.get();
			
			if(ch != (char)0)
				System.out.print(ch);
		}
		
		System.out.println("\n\nUsing bigQ to store the numbers.");
		//put some numbers into bigQ
		for( i = 0; i < 25; i++ )
			bigQ1.put1(1 + i);
			
		//retrieve and display elements from bigQ
		System.out.print("Contents of bigQ: ");
		for( i = 0; i < 26; i++ ) {
			number = bigQ1.get1();
			if( number != 0 )
				System.out.print(number);
		}
		
		System.out.println("\n");
		
		System.out.println("USing smallQ to generate errors.");
		//now, use smallQ to generate some errors
		for( i = 0; i < 5; i++ ) {
			System.out.print("Attempting to store " + (25 - i));
			smallQ1.put1(25 - i);
			System.out.println();
		}
		System.out.println();
		
		//more errors on smallQ
		System.out.print("Contents of smallQ: ");
		for( i = 0; i < 5; i++ ) {
			number = smallQ1.get1();
			
			if(number != 0)
				System.out.print(number);
		}
	}
}
