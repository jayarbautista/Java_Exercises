//Demo for using enum
enum Transport {
	AIR, WATER, LAND
}

class EnumDemo {
	public static void main(String args[]) {
		Transport tp;
		
		tp = Transport.WATER;
		System.out.println("Value of tp is: " + tp);
		
		tp = Transport.AIR;
		if( tp == Transport.AIR )
			System.out.println("tp contains AIR.\n");
			
		switch(tp) {
			case AIR:
				System.out.println("Airplane - Helicopter - Jet - Air Balloon");
				break;
			case WATER:
				System.out.println("Boat - Kayak - Yacht");
				break;
			case LAND:
				System.out.println("Too many to mention.");
				break;
		}
	}
}
