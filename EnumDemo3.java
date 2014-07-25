//Demo for using enum
enum Transport {
	AIR(65), WATER(55), LAND(24);
	
	private int speed;
	
	//Constructor
	Transport(int s) {
		speed = s;
	}
	
	int getSpeed() {
		return speed;
	}
}

class EnumDemo3 {
	public static void main(String args[]) {
		Transport tp;
		
		//display speed of water transpo
		System.out.println("Typical speed for water transpo is " + Transport.WATER.getSpeed() + " miles per hour.\n");
		
		//display all transpo and speed
		System.out.println("All Transport speed: ");
		for(Transport t : Transport.values())
			System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
	}
}

