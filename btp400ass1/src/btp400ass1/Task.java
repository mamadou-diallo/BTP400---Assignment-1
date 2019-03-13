package btp400ass1;

public class Task {
	public String chassisType, axleType, brakeType, gearBoxType, doorType, paintType, transmissionType, collisionSensorType, vinType;
	
	
	public Task(String cT, String gbT, String tT,String dT,String pT, String csT)
	{
		chassisType = cT;
		gearBoxType = gbT;
		axleType = "true";
		brakeType  = "true";
		doorType = dT; 
		paintType = pT;
		transmissionType = tT;
		collisionSensorType = csT;
		vinType = "true";
	}


	@Override
	public String toString() {
		return "Task [chassisType=" + chassisType + ", axleType=" + axleType + ", brakeType=" + brakeType
				+ ", gearBoxType=" + gearBoxType + ", doorType=" + doorType + ", paintType=" + paintType
				+ ", transmissionType=" + transmissionType + ", collisionSensorType=" + collisionSensorType
				+ ", vinType=" + vinType + "]";
	}





	
	
}
