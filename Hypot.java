/*
 * Use the Pythagorean Theorem to
 * find he lngth of the hypotenuse
 * given the lengths of the two opposing
 * sides.
*/

class Hypot {
	public static void main(String args[]) {
		double x, y, z;
		
		x = 3;
		y = 4;
		
		z = Math.sqrt(x*y + y*y);
		
		System.out.println("Hypotenuse is " + z);
	}
}
