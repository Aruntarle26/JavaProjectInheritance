package ConstructorSingleLevel.com;

import ConstructorSingleLevel.com.University;

public class University
{
	String cource;
	String universityName;
	public University()//default Constructor
	{
		
		
		
	}
	public University(String cource,String universityName)//Parameterize constructor
	{
		this.cource=cource;
		this.universityName=universityName;
	}
	public void showUniversityDetails()
	{
		System.out.println("cource Is: "+cource);
		System.out.println("University Name  Is: "+universityName);
	}

}
class Collage extends University
{
	int collageRegno;
	String collageName; 
	public Collage() 
	{
		
		
	}
	public Collage(int collageRegno,String collageName)
	{
		super("java","pune");
		this.collageRegno=collageRegno;
		this.collageName=collageName;
	}
	public void showCollageDetails()
	{
		showUniversityDetails();
		System.out.println("collage Registration Number Is: "+collageRegno);
		System.out.println("collage Name  Is: "+collageName);
	}
}
