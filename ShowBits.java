class ShowBitsDemo {
	int numbits;
	
	ShowBitsDemo(int n) {
		numbits = n;
	}
	
	void show(long val) {
		long mask = 1;
		
		//left shift a 1 into the proper position
		mask <<= numbits - 1;
		
		int spacer = 0;
		
		for( ; mask != 0; mask >>>= 1 ) {
			if((val & mask) != 0)
				System.out.print("1");
			else
				System.out.print("0");
			spacer++;
			
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
}

class ShowBits {
	public static void main(String args[]) {
		ShowBitsDemo b = new ShowBitsDemo(8);
		ShowBitsDemo i = new ShowBitsDemo(32);
		ShowBitsDemo j = new ShowBitsDemo(64);
		
		System.out.println("123 in binary: ");
		b.show(123);
		
		System.out.println("\n87987 in binary: ");
		i.show(87987);
		
		System.out.println("\n237658768 in binary: ");
		j.show(237658768);
		
		System.out.println("\nLow order 8 bits of 87987 in binary: ");
		b.show(87987);
	}
}
