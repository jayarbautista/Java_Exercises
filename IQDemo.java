//A fixed-size queue class for characters
class FixedQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;
	
	//construct an empty queue
	public FixedQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//put a character into the queue
	public void put(char ch) {
		if(putloc == q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	//get a character from the queue
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char)0;
		}
		getloc++;
		return q[getloc];
	}
}

//a circular queue
class CircularQueue implements ICharQ {
	private char q[];
	private int getloc, putloc;
	
	//construct an empty queue
	public CircularQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//put a character into the queue
	public void put(char ch) {
		if(putloc+1 == q.length-1 | ((putloc == q.length-1) & (getloc == 0))) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		if(putloc == q.length)
			putloc = 0;
		q[putloc] = ch;
	}
	
	//get a character from the queue
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char)0;
		}
		getloc++;
		if(getloc == q.length)
			getloc = 0;
		return q[getloc];
	}
}

//a dynamic queue
class DynQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;
	
	//construct an empty queue
	public DynQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//put a character into the queue
	public void put(char ch) {
		if( putloc == q.length-1 ) {
			char t[] = new char[q.length * 2];
			
			//copy elements into new queue
			for( int i = 0; i < q.length; i++ )
				t[i] = q[i];
			
			q = t;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	//get a character from the queue
	public char get() {
		if( getloc == putloc ) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		getloc++;
		return q[getloc];
	}
}

class IQDemo {
	public static void main(String args[]) {
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		ICharQ iQ;
		
		char ch;
		int i;
		
		iQ = q1;
		
		for( i = 0; i < 10; i++ )
			iQ.put((char) ('A' + i));
			
		//show the queue
		System.out.println("Contents of fixed queue: ");
		for( i = 0; i < 10; i++ ) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		iQ = q2;
		
		for( i = 0; i < 10; i++ )
			iQ.put((char) ('Z' - i));
			
		//show the queue
		System.out.println("Contents of dynamic queue: ");
		for( i = 0; i < 10; i++ ) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		iQ = q3;
		
		for( i = 0; i < 10; i++ )
			iQ.put((char) ('A' + i));
			
		//show the queue
		System.out.println("Contents of circular queue: ");
		for( i = 0; i < 10; i++ ) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		//put more characters into circular queue
		for( i = 0; i < 20; i++ )
			iQ.put((char) ('A' + i));
			
		//show the queue
		System.out.println("Contents of circular queue: ");
		for( i = 0; i < 10; i++ ) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println("\nStore and consume from circular queue");
		
		for( i = 0; i < 20; i++ ) {
			iQ.put((char)('A' + i));
			ch = iQ.get();
			System.out.print(ch);
		}
	}
}
