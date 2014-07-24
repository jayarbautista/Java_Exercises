//two-dimensional array demo
class TwoDArray {
	public static void main(String args[]) {
		
		int table[][] = new int[5][5];
		
		for ( int i = 0; i < 5; i++ ) {
			for ( int j = 0; j < 5; j++ ) {
				table[i][j] = (i*5)+j+1;
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
