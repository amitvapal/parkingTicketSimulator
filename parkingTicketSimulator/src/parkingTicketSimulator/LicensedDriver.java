package parkingTicketSimulator;

public class LicensedDriver
{
	private String driverName;
	private int licenseNum;

	
	public LicensedDriver(String dN, int lN)
	{
		driverName = dN;
		licenseNum = lN;
	}
	public String getDriverName()
	{
		return driverName;
	}
	public void setDriverName(String driverName)
	{
		this.driverName = driverName;
	}
	public int getLicenseNum()
	{
		return licenseNum;
	}
	public void setLicenseNum(int licenseNum)
	{
		this.licenseNum = licenseNum;
	}
	
	

}
