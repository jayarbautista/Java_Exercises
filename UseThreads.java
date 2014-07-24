//Creating a Thread by implementing Runnable
class MyThread implements Runnable {
	String threadName;
	
	MyThread(String name) {
		threadName = name;
	}
	
	//entry point of thread
	public void run() {
		System.out.println(threadName + " starting.");
		try {
			for( int count = 0; count < 10; count++ ) {
				Thread.sleep(400);
				System.out.println("In " + threadName + ", count is " + count);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(threadName + " interrupted.");
		}
		System.out.println(threadName + " terminating.");
	}
}

class UseThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting");
		
		//First, construct a MyThread object.
		MyThread mt = new MyThread("Child #1");
		
		//Next, construct a thread from tha object
		Thread newThread = new Thread(mt);
		
		//Finally, start execution of the thread.
		newThread.start();
		
		for( int i = 0; i < 50; i++ ) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		}
		System.out.println("Main threading");
	}
}
