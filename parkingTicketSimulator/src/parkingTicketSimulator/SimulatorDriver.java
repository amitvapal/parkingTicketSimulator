package parkingTicketSimulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimulatorDriver
{

	public static void main(String[] args)
	{
		ArrayList<ParkingSpace> parkingSpaceList = new ArrayList<ParkingSpace>();
		PoliceOfficer cop = new PoliceOfficer("Bob Duncan", 23455664);
		
		try
		{
			System.out.println("Parking Ticket");
			System.out.println("---------------------------------");
			Scanner inFile = new Scanner(new File("cars.txt"));

            while (inFile.hasNextLine() && inFile.nextLine().equals("ParkingSpace:"))
            {
                inFile.nextLine(); // Skip meter header
                int meterTime = Integer.parseInt(inFile.nextLine().strip()); // meter time

                inFile.nextLine(); // Skip car header

                inFile.nextLine(); // Skip driver header
                String driverName = inFile.nextLine().strip(); // driver name
                int driverID = Integer.parseInt(inFile.nextLine().strip()); // driver id

                String carMake = inFile.nextLine().strip(); // Make
                String carModel = inFile.nextLine().strip(); // Model
                String carColor = inFile.nextLine().strip(); // Color
                String carPlate = inFile.nextLine().strip(); // Plate

                int parkedTime = Integer.parseInt(inFile.nextLine().strip()); // Time Parked
                

                LicensedDriver driver = new LicensedDriver(driverName, driverID); // Driver object from data
                ParkedCar car = new ParkedCar(carMake, carModel, carColor, carPlate, parkedTime); // Parked car object from data and driver
                ParkingMeter meter = new ParkingMeter(meterTime); // meter with meter time

                ParkingSpace space = new ParkingSpace(car, meter); // parking space with car and meter

                parkingSpaceList.add(space); // add space to list
            }
		} catch(FileNotFoundException ex)
		{
			System.out.println("Please input correct file");
		}
		ParkingTicket ticket;
		
		
		
		for(ParkingSpace s : parkingSpaceList)
		{
			ticket = (cop).issueTicket(s.getCar(), s.getMeter());
			
			
			if(ticket != null)
			{
				System.out.println("\nTicket:\n------------------------");
				System.out.println((ticket));
			}
			
			
		}
	}

}


