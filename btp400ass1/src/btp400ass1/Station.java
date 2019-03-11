package btp400ass1;

public class Station {
	
	public static int sId = 0;
	public String stationName;
	public int stationId;
	public Station()
	{
		sId++;
		stationId = sId;
		stationName = "";
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	

}
