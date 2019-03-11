package btp400ass1;

import java.util.UUID;

public class VINStation extends Station{
	public String vinId;
	
	public VINStation() {
		super.stationName = "";
		vinId = UUID.randomUUID().toString();
	}

	public String getVinId() {
		return vinId;
	}

	public void setVinId(String vinId) {
		this.vinId = vinId;
	}
	
	
}
