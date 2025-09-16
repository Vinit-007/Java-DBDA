import java.util.*;

class Book {
	String title;
	String author;
	String isbn;



	Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn   = isbn;
	}

	public String toString() {
		return "[Title :" + title + ",Author"+ author + ", ISBN" + isbn + "]";
	}
}

class Library{

	ArrayList<Book> books = new ArrayList<>();

	//add a book
	void addBook(String title , String author , String isbn) {
		books.add(new Book(title,author,isbn));
	}

	//remove a book
	void removeBook(String isbn) {
		for(Book b: books) {
			if(b.isbn.equals(isbn)) {
				books.remove(b);
				System.out.println("Book removed succesfully");
				return;
			}
		}
		System.out.println("no book found with isbn :" + isbn);
	}

	//search by title
	void searchByTitle(String title) {
		for(Book b : books) {
			if(b.title.equalsIgnoreCase(title)) {
				System.out.println("book found with title "+ title);
				return;
			}
		}
		System.out.println("no book found with title :"+title);
	}

	void displayBooks() {
		if(books.isEmpty()) {
			System.out.println("no books in the library");
		}
		else {
			System.out.println("books in library :");
			for(Book b : books) {
				System.out.println(b);
			}
		}
	}

}

public class LibraryManagement{
	public static void main (String args[]) {

		Library lib = new Library();
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("\n-----------CDAC Library------------");
			System.out.println("press 1 to ADD BOOK");
			System.out.println("press 2 to REMOVE BOOK");
			System.out.println("press 3 to SEARCH BOOK BY TITLE");
			System.out.println("press 4 to DISPLAY ALL BOOK");
			System.out.println("press 5 to EXIT !");
			System.out.println("ENTER CHOICE :  ");

			try {
				int choice = sc.nextInt();
				sc.nextLine();

				switch(choice) {

				case 1:
					System.out.println("Enter title: ");
					String title = sc.nextLine();
					System.out.println("Enter author: ");
					String author = sc.nextLine();
					System.out.println("Enter ISBN: ");
					String isbn = sc.nextLine();
					lib.addBook(title, author, isbn);
					break;

				case 2:
					System.out.println("Enter ISBN to remove : ");
					String removeISBN = sc.nextLine();
					lib.removeBook(removeISBN);
					break;

				case 3:
					System.out.println("Enter title to search for :");
					String searchTitle = sc.nextLine();
					lib.searchByTitle(searchTitle);
					break;

				case 4:
					lib.displayBooks();
					break;

				case 5:
					System.out.println("Exiting......gb");
					sc.close();
					return;

				default:
					System.out.println("Invlid choise . please enter valid choice");

				}
			}
			catch(InputMismatchException e) {
				System.out.println("enter valid input between 1 to 5");
				sc.nextLine();
				continue;
			}


		}

	}
}