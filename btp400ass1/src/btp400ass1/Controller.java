package btp400ass1;

import java.io.*;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

	ObservableList<String> gearBoxList = FXCollections.observableArrayList("Pick an option","5 Speed", "6 Speed");
	ObservableList<String> paintBoxList = FXCollections.observableArrayList("Pick an option", "Red", "White", "Black");
	ObservableList<String> doorBoxList = FXCollections.observableArrayList("Pick an option", "2 Doors", "4 Doors");
	ObservableList<String> transmissionBoxList = FXCollections.observableArrayList("Pick an option", "Automatic", "Manual");
	ObservableList<String> chassisBoxList = FXCollections.observableArrayList("Pick an option", "Sedan", "Truck");
	
	@FXML
	public ChoiceBox gearBoxChoice, paintBoxChoice, doorBoxChoice, transmissionBoxChoice, chassisBoxChoice;
	
	@FXML
	Button orderButton, cancelButton;
	
	@FXML
	TextField fileName, cusName;
	
	public String fileNameTxt;
	
	Customer customer = new Customer();
	
	
	public void initialize(){
		gearBoxChoice.setItems(gearBoxList);
		chassisBoxChoice.setItems(chassisBoxList);
		paintBoxChoice.setItems(paintBoxList);
		doorBoxChoice.setItems(doorBoxList);
		transmissionBoxChoice.setItems(transmissionBoxList);
	}
    public void handleOrderButtonClick(ActionEvent event) {
    	//open stream
    	fileNameTxt = fileName.getText();
    	File path = new File(fileNameTxt);
    	//need to write code to add to file "path"
    	
    	//close stream
    	outStream.close();

    	
    	
    	
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
