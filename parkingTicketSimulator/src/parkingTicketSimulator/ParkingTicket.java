package parkingTicketSimulator;

public class ParkingTicket
{
	private PoliceOfficer cop;
	private ParkedCar car;
	private ParkingMeter meter;
	private double totalFine;
	private double firstFineHour = 25.0;
	private double anualFineHour = 10.0;
	private int min;
	
	public ParkingTicket()
	{
		
	}
	
	/*
	 * Calculate illegal time givin car, officer and min to calculate fine
	 */
	public ParkingTicket(ParkedCar carr, PoliceOfficer officer, int minutes)
	{
		car = carr;
		cop = officer;
		min = minutes;
		
		int hours = (int)(min/60.0);
		
		// add one hour if remainder is there
		if((min/60.0) - hours > 0)
		{
			hours++;
			
		}
		
		totalFine = firstFineHour;
		totalFine += (hours * anualFineHour);
		
		
		
	}
	// Create getter and setters


	public double getFirstFineHour()
	{
		return firstFineHour;
	}


	public void setFirstFineHour(double firstFineHour)
	{
		this.firstFineHour = firstFineHour;
	}


	public double getAnualFineHour()
	{
		return anualFineHour;
	}


	public void setAnualFineHour(double anualFineHour)
	{
		this.anualFineHour = anualFineHour;
	}


	public int getMin()
	{
		return min;
	}


	public void setMin(int min)
	{
		this.min = min;
	}


	public void setFine(double fine)
	{
		this.totalFine = fine;
	}


	public PoliceOfficer getCop()
	{
		return cop;
	}


	public void setCop(PoliceOfficer cop)
	{
		this.cop = cop;
	}


	public ParkedCar getCar()
	{
		return car;
	}


	public void setCar(ParkedCar car)
	{
		this.car = car;
	}


	public ParkingMeter getMeter()
	{
		return meter;
	}


	public void setMeter(ParkingMeter meter)
	{
		this.meter = meter;
	}


	public double getFine()
	{
		return totalFine;
	}


	public void setFine(int fine)
	{
		this.totalFine = fine;
	}
	
	/*
	 * Output Car details by using toString method
	 */
	public String toString()
	{
		String meterOutput = "License Number " + car.getLicenseNumber() + "\nCar Make " + car.getMake() + "\nCar Model " + car.getModel()
		 + "\nCar Colour " + car.getColor() + "\nFine " + totalFine + "\nOfficer Name " + cop.getOfficerName() + "\nOfficer ID " + cop.getOfficerIDNum();
		return meterOutput;
	}

}
