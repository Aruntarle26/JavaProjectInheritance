package Multileval2.com;

public class Book
{
	int bookId;
	String publication;
	public Book() {}
	public Book(int bookId, String publication)
	{
		this.bookId=bookId;
		this.publication=publication;
		
	}
	public void showBookDetails()
	{
		System.out.println("Book id: "+bookId);
		System.out.println("Book Publication Is: "+publication);
	}

}
class TextBook extends Book
{
	int textBookId;
	int noOfPages;
	
	public TextBook() {}
	public TextBook(int textBookId, int noOfPages)
	{
		super(1234,"PRAKASH");
		this.textBookId=textBookId;
		this.noOfPages=noOfPages;
		
	}
	public void showTextBookDetails()
	{
		showBookDetails();
		System.out.println("Text Book id : "+textBookId);
		System.out.println("Number of Pages Is: "+noOfPages);
	}
	
	
}
