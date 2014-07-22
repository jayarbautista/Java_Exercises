class MissingPieces {
	public static void main(String args[]) {
		int i, sum = 0;
		
		//iterator is missing
		for( i = 1; i <= 5; ) {
			System.out.println("Pass #" + i);
			i++; // increment loop control
		}
		
		System.out.println();
		
		//initialization is moved up
		i = 1;
		for( ; i <= 5; ) {
			System.out.println("Pass #" + i);
			i++; // increment loop control
		}
		
		//for loop with no body
		for( i = 1; i <= 5; sum+=i++ ) ;
		
		System.out.println();
		System.out.println("Sum is " + sum);
	}
}
