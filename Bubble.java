class Bubble {
	public static void main(String args[]) {
		int num_list[] = { 435, -78, 47, 526084, 79865, -8941, 944165, 109800, -894165165, 247 };
		int size = 10;
		int a, b, t;
		
		//display original array
		System.out.println("Original array list: ");
		for( int i = 0; i < size; i++ )
			System.out.print(num_list[i] + " ");
		
		for( a = 1; a < size; a++ ) {
			for( b = size-1; b >= a; b-- ) {
				if( num_list[b-1] > num_list[b] ) {
					//swap elements
					t = num_list[b-1];
					num_list[b-1] = num_list[b];
					num_list[b] = t;
				}
			}
		}
		
		//display sorted array
		System.out.println("\n\nSorted array is: ");
		for( int i = 0; i < size; i++ ) {
			System.out.print(num_list[i] + " ");
		}
	}
}
