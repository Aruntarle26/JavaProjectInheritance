package Hierarchical.com;

public class University 
{
	String cource;
	String universityName;
	public void getUniversityDetails(String cource,String universityName)
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
