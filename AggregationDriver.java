
import java.util.ArrayList ;

class Author{
	private String name ;
	Author(String name ){
		this.name = name ;
	}
	public String getAuthorName(){
		return name ;
	}
}

class Book{
	private String name ;
	private String type ;
	private Author author ;
	private double price ;

	Book(String name, String type, Author author, double price){
		this.name = name ;
		this.type = type ;
		this.author= author ;
		this.price = price ;		
	}

	public void getBookInfo(){
		System.out.println("\n BOOK INFO");
		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
		System.out.println("Price : " + price + " Rs.");
		System.out.println("Author : "+author.getAuthorName());
	}
}

class Librarian{
	private String name ;
	private String address ;
	private long contact ;

	Librarian(String name, String address, long contact){
		this.name = name ;
		this.address = address ;
		this.contact = contact ;
	}

	public void getLibrarianInfo(){
		System.out.println("\n LIbrarian Information ");
		System.out.println("Name : "+ name);
		System.out.println("Address : "+ address );
		System.out.println("Contact : "+ contact );
	}
}

class Library{
	private String name ;
	private String address ;
	private Librarian librarian ;
	private ArrayList<Book> listBooks = new ArrayList<Book>();

	Library(String name, String address){
		this.name = name ;
		this.address = address ;
	}
	public void getLibraryInfo(){
		System.out.println("Library Information");
		System.out.println("Name : "+ name );
		System.out.println("Address : "+ address);
	}
	public void addLibrarian(Librarian librarian){
			this.librarian = librarian;
		}
		public Librarian getLibrarian(){
			return librarian ;
		}
		public void addBook(Book book){
			listBooks.add(book);
		}
		public ArrayList<Book> getBookList(){
			return listBooks;
		}
}

class AggregationDriver{
	public static void main(String[] args) {
		Library library = new Library("Dnyandeep Library", "Sadashiv Peth, Pune");
		library.getLibraryInfo();

		Librarian librarian = new Librarian("Ramesh Kumar","Pune", 9876543210l);

		library.addLibrarian(librarian);

		library.getLibrarian().getLibrarianInfo();

		Author author1 = new Author("James Gosling");
		Book book1 = new Book("JAVA", "PROGRAMMING", author1, 12000);
		library.addBook(book1);

		Author author2 = new Author("Sane Guruji");
		Book book2 = new Book("Shyam Chi Aai", "Story", author2, 150);
		library.addBook(book2);

		ArrayList<Book> list = library.getBookList();
		for (Book ele : list) {
			ele.getBookInfo();
		}
	}

}

