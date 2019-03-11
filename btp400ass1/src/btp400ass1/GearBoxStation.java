package btp400ass1;

public class GearBoxStation extends Station{
	
	public String gearBox;
	
	public GearBoxStation()
	{
		super.stationName = "Gear Box Station";
	}

	public String getGearBox() {
		return gearBox;
	}

	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
	}
	
	
}
