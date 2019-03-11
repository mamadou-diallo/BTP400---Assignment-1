package btp400ass1;

public class DoorStation extends Station{
	
	public int doorNumber = 0;
	
	public DoorStation() {
		super.stationName = "Door Station";
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	
	
}
