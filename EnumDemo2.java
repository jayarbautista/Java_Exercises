//Demo for using enum
enum Transport {
	AIR, WATER, LAND
}

class EnumDemo2 {
	public static void main(String args[]) {
		Transport tp;
		
		System.out.println("Here are all Transport constants");
		
		//use values
		Transport all[] = Transport.values();
		for( Transport t : all )
			System.out.println(t);
			
		System.out.println();
		
		//use valueOf
		tp = Transport.valueOf("WATER");
		System.out.println("tp contains " + tp);
	}
}
