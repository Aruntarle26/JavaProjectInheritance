package SingleLevel.com;

public class Exam
{
	String examType;
	String subjectName;
	public Exam() {}
	public Exam(String examType,String subjectName )
	{
		this.examType=examType;
		this.subjectName=subjectName;
	}
	public void showExamDetails()
	{
		System.out.println("Exam Type Is: "+examType);
		System.out.println("Subject Name  Is: "+subjectName);
	}

}
