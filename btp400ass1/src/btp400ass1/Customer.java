package btp400ass1;

public class Customer {
	private static int cId = 0;
	public String name;
	public int customerID;
	public Job job = new Job();
	
	
	public Customer(){
		name = "";
		cId++;
		this.customerID = cId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
