package parkingTicketSimulator;

public class Driver
{

	public static void main(String[] args)
	{
		// Creating Parking Car Details
		ParkedCar parkedCar = new ParkedCar();
		parkedCar.setMake("Honda");
		parkedCar.setModel("Civic");
		parkedCar.setColor("Red");
		parkedCar.setLicenseNumber("GLM-0954");
		parkedCar.setNumberMin(126);
		
		// Create meter
		ParkingMeter carMeter = new ParkingMeter();
		carMeter.setMinParkingTime(20);
		
		
		//Police officer details
		int id = 123456;
		PoliceOfficer cop = new PoliceOfficer();
		cop.setOfficerName("Bob Duncan");
		cop.setOfficerIDNum(id);
		
		//Police officer inspects the car if a ticket must be applied
		if(cop.ifIllegalyParked(parkedCar, carMeter))
		{
			ParkingTicket issueingTicket = cop.issueTicket(parkedCar, carMeter);
			System.out.println("Ticket Creating");
			System.out.println("\n"+ issueingTicket);
		}
		else
		{
			System.out.println("Ticket not needed thanks for obeying the law");
		}
		
	}

}
