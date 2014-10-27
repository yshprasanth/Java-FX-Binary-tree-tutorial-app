package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;

public class Controller implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		c = new Circle[] {circle1, circle2, circle3, circle4, circle5, circle6, 
				circle7, circle8, circle9, circle10, circle11, circle12, 
				circle13, circle14, circle15, circle16, circle17};
		t = new Text[] {value1, value2, value3, value4, value5, value6, value7, 
				value8, value9, value10, value11, value12, value13, value14, 
				value15, value16, value17};
		l = new Line[] {line1, line2, line3, line4, line5, line6, line7, line8, 
				line9, line10, line11, line12, line13, line14, line15, line16};
		}
	
	@FXML
	private Button addButton;
	@FXML
	private Button next1;
	@FXML
	private Button next2;
	@FXML
	private Button next3;
	@FXML
	private Button next4;
	@FXML
	private Button next5;
	
	@FXML
	private Button startButton;
	
	@FXML
	private TextField numberBox;
	
	@FXML
	private Label numberLabel;
	
	@FXML
	private Text authors = new Text();
	@FXML
	private Text whatisBST = new Text();
	@FXML
	private Text whatisnotBST = new Text();
	@FXML 
	private Text description1 = new Text();
	@FXML
	private Text description2 = new Text();
	@FXML
	private Text description3 = new Text();
	@FXML
	private Text description4 = new Text();
	@FXML
	private Text description5 = new Text();
	@FXML
	private Text description6 = new Text();
	@FXML 
	private Text depthT = new Text();
	@FXML 
	private Text heightT = new Text();
	
	
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
	
	@FXML
	private Line line1 = new Line();
	@FXML
	private Line line2 = new Line();
	@FXML
	private Line line3 = new Line();
	@FXML
	private Line line4 = new Line();
	@FXML
	private Line line5 = new Line();
	@FXML
	private Line line6 = new Line();
	@FXML
	private Line line7 = new Line();
	@FXML
	private Line line8 = new Line();
	@FXML
	private Line line9 = new Line();
	@FXML
	private Line line10 = new Line();
	@FXML
	private Line line11 = new Line();
	@FXML
	private Line line12 = new Line();
	@FXML
	private Line line13 = new Line();
	@FXML
	private Line line14 = new Line();
	@FXML
	private Line line15 = new Line();
	@FXML
	private Line line16 = new Line();
	
	@FXML
	private ImageView logo;
	@FXML
	private ImageView bst1;
	@FXML
	private ImageView bst2;
	@FXML
	private ImageView bst3;
	@FXML
	private ImageView bst4;
	@FXML
	private ImageView bst5;
	@FXML
	private ImageView subTree;
	
	
	
	

	private Circle[] c;
	private Text[] t;
	private Line[] l;
	private Tree tree = new Tree();
	private int arrayPos = 0;
	
	public void addNumber(ActionEvent event){
		String temp = numberBox.getText();
		if(!tree.contains(Integer.parseInt(temp))){
			add(temp);
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry you cannot enter the same number more than once");
		}
	}
	private void add(String temp){
		
		tree.add(Integer.parseInt(temp));
		TreeNode current = tree.binarySearch(Integer.parseInt(temp));
		
		
		c[arrayPos].setLayoutX(current.cX);
		c[arrayPos].setLayoutY(current.cY);
		t[arrayPos].setLayoutX(current.tX);
		t[arrayPos].setLayoutY(current.tY);
		t[arrayPos].setText(temp);
		c[arrayPos].setVisible(true);
		t[arrayPos].setVisible(true);
		if(arrayPos > 0){
			
			l[arrayPos - 1].setLayoutX(-1);
			l[arrayPos - 1].setLayoutY(-1);
			l[arrayPos - 1].setEndX(current.eX);
			l[arrayPos - 1].setEndY(current.tEY);
			l[arrayPos - 1].setStartX(current.parent.eX);
			l[arrayPos - 1].setStartY(current.parent.bEY);
			l[arrayPos - 1].setVisible(true);
			
		}
		arrayPos++;
	}
	
	public void start(ActionEvent event){
		
		logo.setVisible(false);
		startButton.setVisible(false);
		authors.setVisible(false);
		whatisBST.setVisible(true);
		bst1.setVisible(true);
		description1.setVisible(true);
		next1.setVisible(true);
	}
	
	public void next1(ActionEvent event){
		whatisBST.setVisible(false);
		bst1.setVisible(false);
		description1.setVisible(false);
		next1.setVisible(false);
		whatisnotBST.setVisible(true);
		bst2.setVisible(true);
		bst3.setVisible(true);
		description2.setVisible(true);
		next2.setVisible(true);
		
	}
	
	public void next2(ActionEvent event){
		whatisnotBST.setVisible(false);
		bst2.setVisible(false);
		bst3.setVisible(false);
		description2.setVisible(false);
		next2.setVisible(false);
		description3.setVisible(true);
		addButton.setVisible(true);
		numberBox.setVisible(true);
		numberLabel.setVisible(true);
		next3.setVisible(true);
	}
	
	public void next3(ActionEvent event){
		description3.setVisible(false);
		addButton.setVisible(false);
		numberBox.setVisible(false);
		numberLabel.setVisible(false);
		next3.setVisible(false);
		for(int i = 0; i < c.length; i++){//reset circles and numbers to invis
			c[i].setVisible(false);
			t[i].setVisible(false);
		}
		for(int i = 0; i < l.length; i++){//reset lines to invis
			l[i].setVisible(false);
		}
		
		heightT.setVisible(true);
		depthT.setVisible(true);
		bst4.setVisible(true);
		bst5.setVisible(true);
		description4.setVisible(true);
		next4.setVisible(true);
		
	}
	
	public void next4(ActionEvent event){
		heightT.setVisible(false);
		depthT.setVisible(false);
		bst4.setVisible(false);
		bst5.setVisible(false);
		description4.setVisible(false);
		next4.setVisible(false);
		
		description5.setVisible(true);
		description6.setVisible(true);
		subTree.setVisible(true);
		next5.setVisible(true);
	}
	
	
}