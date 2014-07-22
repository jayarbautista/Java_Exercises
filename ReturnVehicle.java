class Vehicle {
	int passengers; //number of passangers
	int fuelcap;	//fuel capacity in gallons
	int mpg;		//fuel consumption in miles per gallon
	
	//Return the range
	int range() {
		return fuelcap * mpg;
	}
}

//This class declares an object of type Vehicle
class ReturnVehicle {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		int range;
		
		//assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//display range of minivan
		System.out.print("Minivan can carry " + minivan.passengers + " with a range of " + minivan.range());
	}
}
