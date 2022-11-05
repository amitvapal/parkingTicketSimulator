package parkingTicketSimulator;

public class PoliceOfficer
{
	private String officerName;
	private int officerIDNum;
	
	// Create getter and setters
	public PoliceOfficer()
	{
		
	}

	public PoliceOfficer(String name, int num)
	{
		officerName = name;
		officerIDNum = num;
		
	}


	public String getOfficerName()
	{
		return officerName;
	}


	public void setOfficerName(String officerName)
	{
		this.officerName = officerName;
	}


	public int getOfficerIDNum()
	{
		return officerIDNum;
	}


	public void setOfficerIDNum(int officerIDNum)
	{
		this.officerIDNum = officerIDNum;
	}
	
	/*
	 * Check if Car needs ticket by our parameters the car and min
	 */
	public boolean ifIllegalyParked(ParkedCar car, ParkingMeter min)
	{
		if(car.getNumberMin() > min.getMinParkingTime())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	// function used to return ticket object
	// this will be applied to parking ticket and parking metre
	public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter)
	{
		
		int expiredMin = car.getNumberMin() - meter.getMinParkingTime();
		ParkingTicket ticket = null;
		if(expiredMin > 0)
		{
			
			ticket = new ParkingTicket(car,this,expiredMin);
		}
		
		return ticket;
		
	}

	
	
	
	
	

}
