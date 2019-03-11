package btp400ass1;

import java.io.*;
import java.util.*;

public class Job {
	private static int jId = 0;
	public String jobName;
	public int jobId;
	public ArrayList<Station> stationArray = new ArrayList<Station>();
	
	
	public Job()
	{
		jId++;
		jobId = jId;
	}
	
	
	/*
	public BrakeStation brakeStation = new BrakeStation();
	public ChassisStation chassisStaion = new ChassisStation();
	public CollisionSensorsStation collisonSensorsStation = new CollisionSensorsStation();
	public DoorStation doorStation = new DoorStation();
	public GearBoxStation gearBoxStation = new GearBoxStation();
	public PaintStation PaintStation = new PaintStation(); 
	public TransmissionStation transmissionStation = new TransmissionStation(); 
	*/
	

	
	/*
	public boolean selectOptionalFeature(String t)
	{
		if(t == "t")
			return true;
		else
			return false;
	}
	*/
	
}
