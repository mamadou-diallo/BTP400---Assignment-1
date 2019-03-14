package btp400ass1;

import java.io.IOException;

public class Station {
	
	public static int sId = 0;
	public String stationName;
	public int stationId;
	public boolean status;
	public Client client;
	
	public Station() throws ClassNotFoundException, IOException
	{
		sId++;
		stationId = sId;
		stationName = "";
		status = true;
		client = new Client();
		
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
