package Hierarchical;

public class Vehicle
{
	String vehicleType;
	String color;
	public Vehicle() {}
	public Vehicle(String type,String color)
	{
		vehicleType=type;
		this.color=color;
		
	}
	public void showVehicleDetails()
	{
		System.out.println("Vehical Type Is: "+vehicleType);
		System.out.println("Vehical color Is: "+color);
	}
	
}

