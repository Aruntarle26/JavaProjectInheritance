package Hierarchical.com;

public class Hierarchical
{

	public static void main(String[] args)
	{
		EnglishCollage e=new EnglishCollage();
		e.getUniversityDetails("Java", "Samarth");
		e.getECollageDetails(123, "Modern");
		e.showECollageDetails();

		MarathiCollage m=new MarathiCollage();
		m.getUniversityDetails("Java", "Samarth");
		m.getMCollageDetails(124, "Janta");
		m.showMCollageDetails();
		

	}

}
