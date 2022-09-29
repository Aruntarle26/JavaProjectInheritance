package SingleLevel.com;

public class PracticalExam extends Exam
{

	String topic;
	int outOfMarks;
	public PracticalExam() {}
	public PracticalExam(String topic,int outOfMarks )
	{
		super("Anual","java");
		this.topic=topic;
		this.outOfMarks=outOfMarks;
	}
	public void conductPractical()
	{
		showExamDetails();
		System.out.println("Topic Is: "+topic);
		System.out.println("Out of Marks is: "+outOfMarks);
	}


}
