package parkingTicketSimulator;

public class ParkingSpace
{
	private ParkingMeter meter;
	private ParkedCar car;

	public ParkingSpace(ParkedCar c, ParkingMeter m)
	{
		meter = m;
		car = c;
	}

	public ParkingMeter getMeter()
	{
		return meter;
	}

	public void setMeter(ParkingMeter meter)
	{
		this.meter = meter;
	}

	public ParkedCar getCar()
	{
		return car;
	}

	public void setCar(ParkedCar car)
	{
		this.car = car;
	}
	
	public boolean isVacant()
	{
		return this.car == null;
	}

}
