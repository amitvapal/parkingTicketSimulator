package parkingTicketSimulator;

public class ParkedCar
{
	
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int numberMin;
	
	public ParkedCar()
	{
		
	}
	
	/*
	 * Get details of car and the number of min the car was there.
	 */
	public ParkedCar(String carMake, String carModel, String carColor, String licenseCarNumber, int numberCarMin)
	{
		make = "";
		model= "";
		color= "";
		licenseNumber= "";
		numberMin = 0;
		
		make = carMake;
		model = carModel;
		color = carColor;
		licenseNumber = licenseCarNumber;
		numberMin = numberCarMin;
	}

	public ParkedCar(ParkedCar details)
	{
		make = details.make;
        model = details.model;
        color = details.color;
        licenseNumber = details.licenseNumber;
        numberMin = details.numberMin;
	}
	// Create getter and setters

	public String getMake()
	{
		return make;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getLicenseNumber()
	{
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber)
	{
		this.licenseNumber = licenseNumber;
	}

	public int getNumberMin()
	{
		return numberMin;
	}

	public void setNumberMin(int numberMin)
	{
		this.numberMin = numberMin;
	}
	
	public String toString()
	{
		String carDetails = "Car Make: " + make +
				"\nCar Model: " + model +
				"\nCar Color: " + color
				+ "\nCar License Number: " + licenseNumber;
		return carDetails;
	}

}
