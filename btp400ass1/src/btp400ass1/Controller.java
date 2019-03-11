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
	
	@FXML
	public ChoiceBox gearBoxChoice, paintBoxChoice, doorBoxChoice, transmissionBoxChoice;
	
	@FXML
	Button orderButton, cancelButton;
	@FXML
	TextField fileName, cusName;
	
	Customer customer = new Customer();
	
	
	public void initialize(){
		gearBoxChoice.setItems(gearBoxList);
		paintBoxChoice.setItems(paintBoxList);
		doorBoxChoice.setItems(doorBoxList);
		transmissionBoxChoice.setItems(transmissionBoxList);
	}
    public void handleOrderButtonClick(ActionEvent event) {

    }
   
	
	

    
    public void handleCancelButtonClick(ActionEvent event){

    	
    }
    
    

	
}
