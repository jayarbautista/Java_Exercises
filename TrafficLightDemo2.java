enum TrafficLightColors {
	RED(120), GREEN(100), YELLOW(20);
	
	private int speed;
	
	TrafficLightColors(int s) {
		speed = s;
	}
	
	int getSpeed() {
		return speed;
	}
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
						Thread.sleep(tlc.GREEN.getSpeed()); //10 sec.
						break;
					case YELLOW:
						Thread.sleep(tlc.YELLOW.getSpeed()); //2 sec.
						break;
					case RED:
						Thread.sleep(tlc.RED.getSpeed()); //12 sec.
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
		if( tlc.ordinal() == 0 )
			tlc = TrafficLightColors.GREEN;
			
		else if( tlc.ordinal() == 1 )
			tlc = TrafficLightColors.YELLOW;
			
		else if( tlc.ordinal() == 2 )
			tlc = TrafficLightColors.RED;
		
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

class TrafficLightDemo2 {
	public static void main(String args[]) {
		TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColors.GREEN);
		
		for( int i = 0; i < 9; i++ ) {
			System.out.println(tl.getColor());
			tl.waitForChange();
		}
		tl.cancel();
	}
}
