package parkingTicketSimulator;

public class ParkingMeter
{
	private int minParkingTime;
	
	public ParkingMeter()
	{
		
	}

	public ParkingMeter(int minPurchased)
	{
		minParkingTime = minPurchased;
	}
	
	// Create getter and setters

	public int getMinParkingTime()
	{
		return minParkingTime;
	}

	public void setMinParkingTime(int minParkingTime)
	{
		this.minParkingTime = minParkingTime;
	}
	
	public String toString()
	{
		String parkingMeterOutput = "Number of Mins Purchased " + minParkingTime;
		return parkingMeterOutput;
	}

}
