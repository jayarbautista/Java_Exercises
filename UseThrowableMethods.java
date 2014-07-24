//Demo for using the throwable methods
class ExcTest {
	static void genException() {
		int nums[] = new int[4];
		
		System.out.println("Before exception is generated.");
		
		nums[5] = 24;
		System.out.println(nums[5]);
	}
}

class UseThrowableMethods {
	public static void main(String args[]) {
		
		try {
			ExcTest.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Index out of bounds.");
			System.out.println(exc);
			System.out.println("StackTrace:");
			exc.printStackTrace();
		}
		System.out.println("After catch statement.");
	}
}
