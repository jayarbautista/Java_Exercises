//Copy a file to a file
import java.io.*;
class CopyFile {
	public static void main(String args[]) {
		 int i;
		 FileInputStream fin = null;
		 FileOutputStream fout = null;
		 
		 //Make sure that a file has been specified
		 if(args.length != 2) {
			 System.out.println("Usage: CopyFile from to");
			 return;
		 }
		 
		 //Copy a file
		 try {
			 fin = new FileInputStream(args[0]);
			 fout = new FileOutputStream(args[1]);
			 
			 do {
				 i = fin.read();
				 if( i != -1 )
					fout.write(i);
			 }while( i != -1);
		 }
		 catch(IOException exc) {
			 System.out.println("I/O error: " + exc);
		 }
		 
		 finally {
			 try {
				 if( fin != null )
					fin.close();
			 }
			 catch(IOException exc) {
				 System.out.println("Error closing input file.");
			 }
			 
			 try {
				 if ( fout != null )
					fout.close();
			 }	
			 catch(IOException exc) {
				 System.out.println("Error closing output file.");
			 }
		 }
	 }
}
