package Multileval2.com;

public class EnglishBook extends TextBook
{
	String author;
	float cost;
	
	public EnglishBook() {}
	public EnglishBook(String author, float cost)
	{
		super(5321,300);
		this.author=author;
		this.cost=cost;
		
	}
	public void showEnglishBookDetails()
	{
		showTextBookDetails();
		System.out.println("Author name is : "+author);
		System.out.println("cost is : "+cost);
	}

	public static void main(String[] args)
	{
		EnglishBook e=new EnglishBook("Mr.MangeshRao",1500.00f);
		e.showEnglishBookDetails();
		
	}

}
