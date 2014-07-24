//For-each for loop demo
class ForEach{
	public static void main(String args[]) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num[][] = new int[3][5];
		int sum = 0;
		
		for( int x : nums ) {
			System.out.println("Value is: " + x);
			sum += x;
		}
		System.out.println("Sum is: " + sum + "\n\n");
		
		sum = 0;
		//give num some values
		for( int i = 0; i < 3; i++ )
			for( int j = 0; j < 5; j++ )
				num[i][j] = (i+1) * (j+1);
				
		//use for-each for loop to display and sum the values
		for( int x[] : num ) {
			for( int y : x ) {
				System.out.println("Value is: " + y);
				sum += y;
			}
		}
		System.out.println("Sum is: " + sum);
		
	}
}
