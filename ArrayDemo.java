//One-dimensional array demo
class ArrayDemo {
	public static void main(String args[]) {
		int arr[] = new int[10];
		int i;
		
		for( i = 0; i < 10; i++ )
		{
			arr[i] = i;
			System.out.println("Value of index " + i + ": " + arr[i]);
		}
	}
}
