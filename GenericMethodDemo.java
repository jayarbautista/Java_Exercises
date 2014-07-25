class GenericMethodDemo {
	static <T, V extends T> boolean arrayEqual(T[] x, V[] y) {
		if(x.length != y.length)
			return false;
			
		for( int i = 0; i < x.length; i++ )
			if(!x[i].equals(y[i]))
				return false;//arrays differ
				
		return true; //contents of arrays are equivalent
	}
	
	public static void main(String args[]) {
		Integer nums1[] = { 1, 2, 3, 4, 5 };
		Integer nums2[] = { 1, 2, 3, 4, 5 };
		Integer nums3[] = { 1, 2, 3, 4, 7 };
		Integer nums4[] = { 1, 2, 3, 4, 8 };
		
		if(arrayEqual(nums1, nums1))
			System.out.println("nums equal nums");
		if(arrayEqual(nums1, nums2))
			System.out.println("nums equal nums2");
		if(arrayEqual(nums1, nums3))
			System.out.println("nums equal nums3");
		if(arrayEqual(nums1, nums4))
			System.out.println("nums equal nums4");
	}
}
