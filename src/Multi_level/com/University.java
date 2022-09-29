package Multi_level.com;

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
class Collage extends University
{
	int collageRegno;
	String collageName; 
	public void getCollageDetails(int collageRegno,String collageName)
	{
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
class Student extends Collage
{
	String studentName;
	int studentRollno;
	public void getStudentDetails(String studentName,int studentRollno)
	{
		this.studentName=studentName;
		this.studentRollno=studentRollno;
	}
	public void showSudentDetails()
	{
		showCollageDetails();
		System.out.println("Student Name Is: "+studentName);
		System.out.println("Student Roll Is: "+studentRollno);
	}
}

