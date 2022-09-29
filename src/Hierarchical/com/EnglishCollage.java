package Hierarchical.com;

public class EnglishCollage extends University
{

	int ecollageRegno;
	String ecollageName; 
	public void getECollageDetails(int ecollageRegno,String ecollageName)
	{
		this.ecollageRegno=ecollageRegno;
		this.ecollageName=ecollageName;
	}
	public void showECollageDetails()
	{
		showUniversityDetails();
		System.out.println("English collage Registration Number Is: "+ecollageRegno);
		System.out.println("English collage Name  Is: "+ecollageName);
	}

}
class MarathiCollage extends University
{

	int mcollageRegno;
	String mcollageName; 
	public void getMCollageDetails(int mcollageRegno,String mcollageName)
	{
		this.mcollageRegno=mcollageRegno;
		this.mcollageName=mcollageName;
	}
	public void showMCollageDetails()
	{
		showUniversityDetails();
		System.out.println("Marathi collage Registration Number Is: "+mcollageRegno);
		System.out.println("Marathi collage Name  Is: "+mcollageName);
	}

}