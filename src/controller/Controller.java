package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class Controller implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	@FXML
	private Button addButton;
	
	@FXML
	private TextField numberBox;
	
	@FXML
	private Circle circle1 = new Circle();
	
	@FXML
	private Circle circle2 = new Circle();
	
	@FXML
	private Circle circle3 = new Circle();
	
	
	@FXML
	private Text value1 = new Text();
	
	@FXML
	private Text value2 = new Text();
	
	@FXML
	private Text value3 = new Text();
	
	
	private Text[] textArray;
	
	Circle[] c = {circle1, circle2, circle3};
	
	

	
	
	Tree t = new Tree();
	
    
	private int arrayPos = 0;
	
	public void addNumber(ActionEvent event){
		String temp = numberBox.getText();
		
		
		
		
		circle1.setLayoutX(355);
		circle1.setLayoutY(100);
		Text t = textArray[0];
		t.setLayoutX(364);
		t.setLayoutY(105);
		t.setText(temp);
		circle1.setVisible(true);
		t.setVisible(true);
		
		
//		t.add(Integer.parseInt(temp));
//		TreeNode current = t.binarySearch(Integer.parseInt(temp));
//		
//		circleArray[arrayPos].setLayoutX(current.cX);
//		circleArray[arrayPos].setLayoutY(current.cY);
//		textArray[arrayPos].setLayoutX(current.tX);
//		textArray[arrayPos].setLayoutY(current.tY);
//		textArray[arrayPos].setText(temp);
//		circleArray[arrayPos].setVisible(true);
//		textArray[arrayPos].setVisible(true);
//		arrayPos++;
//		
//		System.out.println(current.info);
	}

}
