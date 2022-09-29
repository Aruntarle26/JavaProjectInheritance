package ConstructorSingleLevel.com;
import java.util.Scanner;
public class SingleInheritance
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Collage Registration Number: ");
		
		int registationNo=sc.nextInt();
		System.out.println("Enter the Collage Name: ");
		sc.nextLine();
		String collageName=sc.nextLine();
		Collage c=new Collage(registationNo,collageName);
		c.showCollageDetails();
		
		
		

	}

}
