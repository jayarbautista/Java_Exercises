//Simple package demo
package JavaPrograms;

class Book {
	private String title;
	private String author;
	private int pubDate;
	
	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}
	
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}

class BookDemo {
	public static void main(String args[]) {
		Book books[] = new Book[5];
		
		books[0] = new Book("aaa","bbb",2010);
		books[1] = new Book("ccc","ddd",2011);
		books[2] = new Book("eee","fff",2012);
		books[3] = new Book("ggg","hhh",2013);
		books[4] = new Book("iii","jjj",2014);
		
		for( int i = 0; i < books.length; i++ )
			books[i].show();
	}
}
