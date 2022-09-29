package Hierarchical;

public class TwoWheeler extends Vehicle
{
	int noOfTyres;
	String twoWheelerName;
	public TwoWheeler() {}
	public TwoWheeler(int noOfTyres,String twoWheelerName)
	{
		super("Commercial","Red");
		this.noOfTyres=noOfTyres;
		this.twoWheelerName=twoWheelerName;
		
	}
	public void showTwoWheelerDetails()
	{
		showVehicleDetails();
		System.out.println("Number of tyres of two Wheeler Is: "+noOfTyres);
		System.out.println("TwoWheeler Name  Is: "+twoWheelerName);
	}
}
class FourWheeler extends Vehicle
{
	int noOfTyres;
	String fourWheelerName;
	public FourWheeler() {}
	public FourWheeler(int noOfTyres,String fourWheelerName)
	{
		super("Commercial or Heavy Use","Green");
		this.noOfTyres=noOfTyres;
		this.fourWheelerName=fourWheelerName;
		
	}
	public void showFourWheelerDetails()
	{
		showVehicleDetails();
		System.out.println("Nuber of Tyres Of Four Wheeler Is: "+noOfTyres);
		System.out.println("Four Wheeler Name Is: "+fourWheelerName);
	}

	
}
