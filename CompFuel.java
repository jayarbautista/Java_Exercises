class Vehicle {
	int passengers; //number of passangers
	int fuelcap;	//fuel capacity in gallons
	int mpg;		//fuel consumption in miles per gallon
	
	//Return the range
	int range() {
		return fuelcap * mpg;
	}
	
	//Compute fuel needed for a given distance
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

//This class declares an object of type Vehicle
class CompFuel {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		double gallons;
		int distance = 252;
		
		//assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		gallons = minivan.fuelneeded(distance);
		
		//display range of minivan
		System.out.println("To go " + distance + " miles sportscar needs " + gallons + " gallons of fuel.");
	}
}
