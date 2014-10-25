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
	private Circle circle4 = new Circle();
	@FXML
	private Circle circle5 = new Circle();
	@FXML
	private Circle circle6 = new Circle();
	@FXML
	private Circle circle7 = new Circle();
	@FXML
	private Circle circle8 = new Circle();
	@FXML
	private Circle circle9 = new Circle();
	@FXML
	private Circle circle10 = new Circle();
	@FXML
	private Circle circle11 = new Circle();
	@FXML
	private Circle circle12 = new Circle();
	@FXML
	private Circle circle13 = new Circle();
	@FXML
	private Circle circle14 = new Circle();
	@FXML
	private Circle circle15 = new Circle();
	@FXML
	private Circle circle16 = new Circle();
	@FXML
	private Circle circle17 = new Circle();
	
	@FXML
	private Text value1 = new Text();
	@FXML
	private Text value2 = new Text();
	@FXML
	private Text value3 = new Text();
	@FXML
	private Text value4 = new Text();
	@FXML
	private Text value5 = new Text();
	@FXML
	private Text value6 = new Text();
	@FXML
	private Text value7 = new Text();
	@FXML
	private Text value8 = new Text();
	@FXML
	private Text value9 = new Text();
	@FXML
	private Text value10 = new Text();
	@FXML
	private Text value11 = new Text();
	@FXML
	private Text value12 = new Text();
	@FXML
	private Text value13 = new Text();
	@FXML
	private Text value14 = new Text();
	@FXML
	private Text value15 = new Text();
	@FXML
	private Text value16 = new Text();
	@FXML
	private Text value17 = new Text();
	
	
	private Circle[] c;
	private Text[] t;
	
	private void fillArray(){
		c = new Circle[] {circle1, circle2, circle3, circle4, circle5, circle6, 
				circle7, circle8, circle9, circle10, circle11, circle12, 
				circle13, circle14, circle15, circle16, circle17};
		t = new Text[] {value1, value2, value3, value4, value5, value6, value7, 
				value8, value9, value10, value11, value12, value13, value14, 
				value15, value16, value17};
		}
	
	private Tree tree = new Tree();
	private int arrayPos = 0;
	
	public void addNumber(ActionEvent event){
		fillArray();
		String temp = numberBox.getText();
		tree.add(Integer.parseInt(temp));
		TreeNode current = tree.binarySearch(Integer.parseInt(temp));
		
		c[arrayPos].setLayoutX(current.cX);
		c[arrayPos].setLayoutY(current.cY);
		t[arrayPos].setLayoutX(current.tX);
		t[arrayPos].setLayoutY(current.tY);
		t[arrayPos].setText(temp);
		c[arrayPos].setVisible(true);
		t[arrayPos].setVisible(true);
		arrayPos++;
		
		System.out.println(current.info);
	}

}