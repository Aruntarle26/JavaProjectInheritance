package SingleLevel.com;

import java.util.Scanner;

public class SingleInheristance 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  cource: ");
		String cource=sc.nextLine();
		System.out.println("Enter the  University Name: ");
	
		String universityName=sc.nextLine();
		System.out.println("Enter the Collage Registration Number: ");
		
		int registationNo=sc.nextInt();
		System.out.println("Enter the Collage Name: ");
		sc.nextLine();
		String collageName=sc.nextLine();
		Collage c=new Collage();
		c.getUniversityDetails(cource,universityName);
		c.getCollageDetails(registationNo,collageName);
		c.showCollageDetails();
		

	}

}
