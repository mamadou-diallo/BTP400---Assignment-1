package btp400ass1;

import java.io.*;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

	ObservableList<String> gearBoxList = FXCollections.observableArrayList("Pick an option","FWD", "AWD");
	ObservableList<String> paintBoxList = FXCollections.observableArrayList("Pick an option", "Red", "White", "Black");
	ObservableList<String> doorBoxList = FXCollections.observableArrayList("Pick an option", "2 Doors", "4 Doors");
	ObservableList<String> transmissionBoxList = FXCollections.observableArrayList("Pick an option", "Automatic", "Manual");
	ObservableList<String> chassisBoxList = FXCollections.observableArrayList("Pick an option", "Sedan", "Truck");
	
	@FXML
	public ChoiceBox gearBoxChoice, paintBoxChoice, doorBoxChoice, transmissionBoxChoice, chassisBoxChoice;
	
	@FXML
	public CheckBox collisionSensorCheckBoxChoice;
	@FXML
	Button orderButton, cancelButton;
	
	@FXML
	TextField fileName, cusName;
	
	public String fileNameTxt, customerNameTxt, getGearBoxChoice, getChassisBoxChoice, getPaintBoxChoice, getDoorBoxChoice, getTransmissionBoxChoice, getCollisionSensorBoxChoice;
	public String setGearBoxChoice = null, setChassisBoxChoice = null, setPaintBoxChoice = null, setDoorBoxChoice = null, setTransmissionBoxChoice = null, setCollisionSensorBoxChoice;
	public String empty = new String();
	public String errorOption = "Pick an option";
	Customer customer = new Customer();
	
	
	public void initialize(){
		gearBoxChoice.setItems(gearBoxList);
		chassisBoxChoice.setItems(chassisBoxList);
		paintBoxChoice.setItems(paintBoxList);
		doorBoxChoice.setItems(doorBoxList);
		transmissionBoxChoice.setItems(transmissionBoxList);
		
	}
	
	
    public void handleOrderButtonClick(ActionEvent event) throws IOException {
    	
    	fileNameTxt = fileName.getText();
    	customerNameTxt = cusName.getText();
    	customer.setName(customerNameTxt);
    	getGearBoxChoice = gearBoxChoice.getValue().toString();
    	if(getGearBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a gear box");
    		errorAlert.showAndWait();
    	}else if(getGearBoxChoice.equals("FWD")){
    		setGearBoxChoice = getGearBoxChoice;
    	}else if(getGearBoxChoice.equals("AWD")){
    		setGearBoxChoice = getGearBoxChoice;
    	}
    	
    	
    	getChassisBoxChoice = chassisBoxChoice.getValue().toString();
  
    	if(getChassisBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a chassis");
    		errorAlert.showAndWait();
    	}else if(getChassisBoxChoice.equals("Sedan")){
    		setChassisBoxChoice = getChassisBoxChoice;
    	}else{
    		setChassisBoxChoice = getChassisBoxChoice;
    	}
    	
    	getPaintBoxChoice = paintBoxChoice.getValue().toString();
    	
    	if(getPaintBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a paint color");
    		errorAlert.showAndWait();
    	}else if(getPaintBoxChoice.equals("White")){
    		setPaintBoxChoice = getPaintBoxChoice;
    	}else if(getPaintBoxChoice.equals("Red")){
    		setPaintBoxChoice = getPaintBoxChoice;
    	}else{
    		setPaintBoxChoice = getPaintBoxChoice;
    	}
    	
    	
    	//Select Door
    	getDoorBoxChoice = doorBoxChoice.getValue().toString();
    	
    	if(getDoorBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a door");
    		errorAlert.showAndWait();
    	}else if(getDoorBoxChoice.equals("2 Doors")){
    		setDoorBoxChoice = getDoorBoxChoice;
    	}else {
    		setDoorBoxChoice = getDoorBoxChoice;
    	}
    	
    	getTransmissionBoxChoice = transmissionBoxChoice.getValue().toString();
    	if(getTransmissionBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a transmission type");
    		errorAlert.showAndWait();
    	}else if(getTransmissionBoxChoice.equals("Automatic")){
    		setTransmissionBoxChoice = getTransmissionBoxChoice;
    	}else{
    		setTransmissionBoxChoice = getTransmissionBoxChoice;
    	}
    	
    	
    	if(collisionSensorCheckBoxChoice.isSelected())
    	{
    		setCollisionSensorBoxChoice = "true";
    	}else{
    		setCollisionSensorBoxChoice = "false";
    	}
    	
    	
    	
    	
    	try{
    	if(!fileNameTxt.equals(empty) || !setTransmissionBoxChoice.equals(empty) || !setGearBoxChoice.equals(empty) || !setChassisBoxChoice.equals(empty) || !setPaintBoxChoice.equals(empty) || !setDoorBoxChoice.equals(empty))
    	{
    		customer.job.setFileName(fileNameTxt);
    		customer.job.writeToFile(setChassisBoxChoice, setGearBoxChoice, setTransmissionBoxChoice, setDoorBoxChoice, setPaintBoxChoice, setCollisionSensorBoxChoice);
    	}
    	}catch(NullPointerException e){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Make a selection");
    		errorAlert.setContentText("Please make a selection for every feature");
    		errorAlert.showAndWait();
    	}
    	
    	
    	
    	/*
    	getGearBoxChoice = gearBoxChoice.getValue().toString();
    	if(getGearBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a gear box");
    		errorAlert.showAndWait();
    	}else if(getGearBoxChoice.equals("5 Speed")){
    		GearBoxStation gearBox = new GearBoxStation();
    		gearBox.setGearBox("5 Speed");
    		customer.job.stationArray.add(gearBox);
    	}else{
    		GearBoxStation gearBox = new GearBoxStation();
    		gearBox.setGearBox("6 Speed");
    		customer.job.stationArray.add(gearBox);
    	}
    	
    	
    	getChassisBoxChoice = chassisBoxChoice.getValue().toString();
  
    	if(getChassisBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a chassis");
    		errorAlert.showAndWait();
    	}else if(getGearBoxChoice.equals("5 Speed")){
    		ChassisStation chassis = new ChassisStation();
    		chassis.setChassis("Sedan");
    		customer.job.stationArray.add(chassis);
    	}else{
    		ChassisStation chassis = new ChassisStation();
    		chassis.setChassis("Truck");
    		customer.job.stationArray.add(chassis);
    	}
    	
    	getPaintBoxChoice = paintBoxChoice.getValue().toString();
    	
    	if(getPaintBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a paint color");
    		errorAlert.showAndWait();
    	}else if(getGearBoxChoice.equals("White")){
    		PaintStation paint = new PaintStation();
    		paint.setPaintColor("White");
    		customer.job.stationArray.add(paint);
    	}else if(getGearBoxChoice.equals("Red")){
    		PaintStation paint = new PaintStation();
    		paint.setPaintColor("Red");
    		customer.job.stationArray.add(paint);
    	}else{
    		PaintStation paint = new PaintStation();
    		paint.setPaintColor("Black");
    		customer.job.stationArray.add(paint);
    	}
    	
    	
    	//Select Door
    	getDoorBoxChoice = doorBoxChoice.getValue().toString();
    	
    	if(getDoorBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a door");
    		errorAlert.showAndWait();
    	}else if(getDoorBoxChoice.equals("2 Doors")){
    		DoorStation doors = new DoorStation();
    		doors.setDoorNumber(2);
    		customer.job.stationArray.add(doors);
    	}else{
    		DoorStation doors = new DoorStation();
    		doors.setDoorNumber(4);
    		customer.job.stationArray.add(doors);
    	}
    	
    	getTransmissionBoxChoice = transmissionBoxChoice.getValue().toString();
    	if(getTransmissionBoxChoice.equals(errorOption)){
    		Alert errorAlert = new Alert(AlertType.INFORMATION);
    		errorAlert.setHeaderText("Input not valid");
    		errorAlert.setContentText("You must pick a transmission type");
    		errorAlert.showAndWait();
    	}else if(getTransmissionBoxChoice.equals("Automatic")){
    		TransmissionStation transmissionType = new TransmissionStation();
    		transmissionType.setTransmissionType("Automatic");
    		customer.job.stationArray.add(transmissionType);
    	}else{
    		TransmissionStation transmissionType = new TransmissionStation();
    		transmissionType.setTransmissionType("Manual");
    		customer.job.stationArray.add(transmissionType);
    	}
    	*/
    	System.out.println(getGearBoxChoice);
    	System.out.println(getChassisBoxChoice);
    	System.out.println(getPaintBoxChoice);
    	System.out.println(getDoorBoxChoice);
    	System.out.println(getTransmissionBoxChoice);
    	
    	//close stream
    	//outStream.close();

    	
    	
    	
    	// add code to take values from FXML(verify that option has been selected) -> set data to Stations -> add Station to arraylist
    	// example : customer.setName(cusName);
    	/*
    	 * example : if doorBoxChoice == 2 Door ... Create new DoorStation -> 
    	 * 		( wrong syntax ) job.stationArray.add etc etc 
    	 * 
    	 */
    	
    }
   
	
	
    //controller must be added to view station
    
    
    public void handleCancelButtonClick(ActionEvent event){

    	
    }
    
    

	
}
