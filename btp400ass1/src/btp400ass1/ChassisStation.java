package btp400ass1;

public class ChassisStation extends Station{
	public String chassis;
	
	public ChassisStation()
	{
		super.stationName = "Chassis Station";
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	
	
	
}
