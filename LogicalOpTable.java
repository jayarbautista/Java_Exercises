/*
 * Try This 2-2
 * 
 * Truth Table for logical operators
*/

class LogicalOpTable {
	public static void main(String args[]) {
		int p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = 1;
		q = 1;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) +"\t");
		System.out.println((p^q) + "\t" + (0));
		
		p = 1;
		q = 0;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) +"\t");
		System.out.println((p^q) + "\t" + (0));
		
		p = 0;
		q = 1;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) +"\t");
		System.out.println((p^q) + "\t" + (1));
		
		p = 0;
		q = 0;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) +"\t");
		System.out.println((p^q) + "\t" + (1));
		
	}
}
