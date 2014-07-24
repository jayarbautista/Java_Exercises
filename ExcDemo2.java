//Exception handling through a method from another class
class ExcTest {
	static void genException() {
		int nums[] = new int[4];
		
		System.out.println("Before exception is generated.");
		
		nums[5] = 24;
		System.out.println(nums[5]);
	}
}

class ExcDemo2 {
	public static void main(String args[]) {
		
		try {
			ExcTest.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Index out of bounds.");
		}
		System.out.println("After catch statement.");
	}
}
