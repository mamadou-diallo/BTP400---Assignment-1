package btp400ass1;

public class TransmissionStation extends Station{
	public String transmissionType;
	
	public TransmissionStation() {
		super.stationName = "Transmission Station";
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	
}
