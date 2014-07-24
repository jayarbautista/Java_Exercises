//suspending, resuming and stopping a thread
class MyThread implements Runnable {
	Thread thrd;
	
	boolean suspended;
	boolean stopped;
	
	MyThread(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for( int i = 1; i < 1000; i++ ) {
				System.out.print(i + " ");
				if((1 % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				//use synchronized block to check suspended and stopped.
				synchronized(this) {
					while(suspended) {
						wait();
					}
					if(stopped)
						break;
				}
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
	
	//stop the thread
	synchronized void mystop() {
		stopped = true;
		
		//the following ensures that a suspended thread can be stopped.
		suspended = false;
		notify();
	}
	
	//suspend the thread
	synchronized void mysuspend() {
		suspended = true;
	}
	
	//resume the thread
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}

class Suspend {
	public static void main(String args[]) {
		MyThread mt1 = new MyThread("My Thread");
		
		try {
			Thread.sleep(1000);
			
			mt1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			mt1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			mt1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			mt1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			mt1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("Main thread Interrupted.");
		}
		
		//wait for thread to finish
		try {
			mt1.thrd.join();
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread terminating.");
	}
}
