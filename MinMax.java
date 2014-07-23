//Find the minimum and maximum values in an array
class MinMax {
	public static void main(String args[]) {
		int num[] = new int[10];
		int min, max;
		
		num[0] = 435;
		num[1] = -78;
		num[2] = 47;
		num[3] = 526084;
		num[4] = 79865;
		num[5] = -8941;
		num[6] = 944165;
		num[7] = 109800;
		num[8] = -894165165;
		num[9] = 247;
		
		//array initialization can be declared and initialized as:
		//int num[] = { 435, -78, 47, 526084, 79865, -8941, 944165, 109800, -894165165, 247 };
		
		min = max = num[0];
		
		for( int i = 0; i < num.length; i++ ) {
			if( num[i] < min )
				min = num[i];
			if( num[i] > max )
				max = num[i];
		}
		System.out.println("Min : " + min + "\nMax : " + max);
	}
}
