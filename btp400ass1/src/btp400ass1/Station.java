package btp400ass1;

public class Station {
	
	public static int sId = 0;
	public String stationName;
	public int stationId;
	public boolean status;
	
	public Station()
	{
		sId++;
		stationId = sId;
		stationName = "";
		status = true;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
