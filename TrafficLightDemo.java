enum TrafficLightColors {
	RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable {
	private Thread thrd;
	private TrafficLightColors tlc;
	boolean stop = false;
	boolean change = false;
	
	TrafficLightSimulator(TrafficLightColors init) {
		tlc = init;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tlc = TrafficLightColors.RED;
		
		thrd = new Thread();
		thrd.start();
	}
	
	//start up the light
	public void run() {
		while(!stop) {
			try {
				switch(tlc) {
					case GREEN:
						Thread.sleep(10000); //10 sec.
						break;
					case YELLOW:
						Thread.sleep(2000); //2 sec.
						break;
					case RED:
						Thread.sleep(12000); //12 sec.
						break;
				}
			}
			catch(InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	
	//change color
	synchronized void changeColor() {
		switch(tlc) {
			case RED:
				tlc = TrafficLightColors.GREEN;
				break;
			case YELLOW:
				tlc = TrafficLightColors.RED;
				break;
			case GREEN:
				tlc = TrafficLightColors.YELLOW;
		}
		change = true;
		notify(); // signal that the light has changed
	}
	
	//wait until a light change occurs
	synchronized void waitForChange() {
		try {
			while(!change)
				wait(); //wait for light to change
			change = false;
		}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	//return current color
	synchronized TrafficLightColors getColor() {
		return tlc;
	}
	
	//stop the traffic light
	synchronized void cancel() {
		stop = true;
	}
}

class TrafficLightDemo {
	public static void main(String args[]) {
		TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColors.GREEN);
		
		for( int i = 0; i < 9; i++ ) {
			System.out.println(tl.getColor());
			tl.waitForChange();
		}
		tl.cancel();
	}
}
