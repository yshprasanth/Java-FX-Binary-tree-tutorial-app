package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
		c1 = new Circle[] {circle18, circle21, circle31, circle41, circle51, 
				circle61, circle71, circle81, circle91, circle101, circle111, 
				circle121, circle131, circle141, circle151, circle161, circle171};
		t1 = new Text[] {value18, value21, value31, value41, value51, value61, 
				value71, value81, value91, value101, value111, value121, value131, 
				value141, value151, value161, value171};
		l1 = new Line[] {line17, line21, line31, line41, line51, line61, line71, 
				line81, line91, line101, line111, line121, line131, line141, 
				line151, line161};
		i1 = new ImageView[] {inorder1, inorder2, inorder3, inorder4, inorder5, 
				inorder6, inorder8, inorder7};
		i2 = new ImageView[] {inorder1, inorder5, inorder3, inorder2,inorder4, 
				inorder6, inorder7, inorder8};
		i3 = new ImageView[] {inorder1, inorder2, inorder4, inorder3, inorder8, 
				inorder7, inorder6, inorder5};
		dropDown.setItems(FXCollections.observableArrayList(
			    "PreOrder", "InOrder","PostOrder", "Get Min", "Get Max", "Leafs",
			    "Parent-Child")
			);
		
		}
	@FXML
	private ChoiceBox<String> dropDown; //drop down for traversal choices
	
	
	
	@FXML
	private Button addButton;
	@FXML
	private Button addButton1;
	@FXML
	private Button deleteButton;
	@FXML
	private Button clear;
	@FXML
	private Button clear1;
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
	private Button next6;
	@FXML
	private Button next7;
	@FXML
	private Button next8;
	@FXML
	private Button next9;
	@FXML
	private Button inorderButton;
	@FXML
	private Button preorderButton;
	@FXML
	private Button postorderButton;
	@FXML
	private Button startButton;
	@FXML
	private Button depthButton;
	@FXML
	private Button heightButton;
	@FXML
	private Button resultButton;
	
	@FXML
	private TextField numberBox, numberBox1, depthBox, answer;
	
	@FXML
	private Label numberLabel, numberLabel1;
	
	@FXML
	private TextArea traverseOrder;
	@FXML
	private Text authors;
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
	private Text depthTextQ;
	@FXML
	private Text or;
	@FXML
	private Text selectDD;
	@FXML
	private Text depthorHeight;
	
	
	
	@FXML
	private Circle circle1, circle2, circle3, circle4, circle5, circle6, 
	circle7, circle8, circle9, circle10, circle11, circle12, circle13, circle14,
	circle15, circle16, circle17, circle18, circle21, circle31, circle41, circle51, 
	circle61, circle71, circle81, circle91, circle101, circle111, circle121, circle131, 
	circle141, circle151, circle161, circle171;
	
	@FXML
	private Text value1, value2, value3, value4, value5, value6, value7, value8, 
	value9, value10, value11, value12, value13, value14, value15, value16, value17,
	value18, value21, value31, value41, value51, value61, value71, value81, 
	value91, value101, value111, value121, value131, value141, value151, value161, 
	value171, description7, preorderText;
	
	@FXML
	private Line line1, line2, line3, line4, line5, line6, line7, line8, line9,
	line10, line11, line12, line13, line14, line15, line16, line17, line21, 
	line31, line41, line51, line61, line71, line81, line91, line101, line111, 
	line121, line131, line141, line151, line161;
	
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
	@FXML
	private ImageView minandmax;
	@FXML
	private ImageView leafs;
	@FXML
	private ImageView inorder1;
	@FXML
	private ImageView inorder2;
	@FXML
	private ImageView inorder3;
	@FXML
	private ImageView inorder4;
	@FXML
	private ImageView inorder5;
	@FXML
	private ImageView inorder6;
	@FXML
	private ImageView inorder7;
	@FXML
	private ImageView inorder8;
	
	
	
	

	private Circle[] c, c1;
	private Text[] t, t1;
	private Line[] l, l1;
	private Tree tree = new Tree();
	private Tree tree1 = new Tree();
	private ImageView[] i1, i2, i3;
	private int arrayPos = 0;
	private int arrayPos1 = 0;
	
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
	
	public void clear(ActionEvent event){
		if(tree.root != null){
			for(int i = 0; i < c.length; i++){
				c[i].setVisible(false);
				t[i].setVisible(false);
			}
			for(int i = 0; i < l.length; i++){
				l[i].setVisible(false);
			}
			tree.root = null;
			arrayPos = 0;
		}
		answer.setText("");
	}
	
	public void addNumber1(ActionEvent event){
		String temp = numberBox1.getText();
		if(!tree1.contains(Integer.parseInt(temp))){
			add1(temp);
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry you cannot enter the same number more than once");
		}
	}
	private void add1(String temp){
		
		tree1.add(Integer.parseInt(temp));
		TreeNode current = tree1.binarySearch(Integer.parseInt(temp));
		
		
		c1[arrayPos1].setLayoutX(current.cX);
		c1[arrayPos1].setLayoutY(current.cY);
		t1[arrayPos1].setLayoutX(current.tX);
		t1[arrayPos1].setLayoutY(current.tY);
		t1[arrayPos1].setText(temp);
		c1[arrayPos1].setVisible(true);
		t1[arrayPos1].setVisible(true);
		if(arrayPos1 > 0){
			
			l1[arrayPos1 - 1].setLayoutX(-1);
			l1[arrayPos1 - 1].setLayoutY(-1);
			l1[arrayPos1 - 1].setEndX(current.eX);
			l1[arrayPos1 - 1].setEndY(current.tEY);
			l1[arrayPos1 - 1].setStartX(current.parent.eX);
			l1[arrayPos1 - 1].setStartY(current.parent.bEY);
			l1[arrayPos1 - 1].setVisible(true);
			
		}
		arrayPos1++;
	}
	
	public void clear1(ActionEvent event){
		if(tree1.root != null){
			for(int i = 0; i < c1.length; i++){
				c1[i].setVisible(false);
				t1[i].setVisible(false);
			}
			for(int i = 0; i < l.length; i++){
				l1[i].setVisible(false);
			}
			tree1.root = null;
			arrayPos1 = 0;
		}
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
		clear.setVisible(true);
		numberBox.setVisible(true);
		numberLabel.setVisible(true);
		next3.setVisible(true);
	}
	
	public void next3(ActionEvent event){
		description3.setVisible(false);
		addButton.setVisible(false);
		clear.setVisible(false);
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
	
	public void next5(ActionEvent event)
	{   description5.setVisible(false);
	    description6.setVisible(false);
	    subTree.setVisible(false);
	    next5.setVisible(false);
	    
	    description7.setVisible(true);
	    inorderButton.setVisible(true);
	    inorder1.setVisible(true);
	    traverseOrder.setVisible(true);
	    next6.setVisible(true);
	}
	

	int count = 1;
	String order = "";
	
	public void inorderTraversal(ActionEvent event)
	{

		int[] numbers = new int[] {0, 1,3,6,8,10,13,14};

		if(count == 8){
			count = 1;
			i1[7].setVisible(false);
		}
		i1[count - 1].setVisible(false);
		i1[count].setVisible(true);
		if(count == 1){
			order = "" + numbers[count];
		}
		else{
			order += ", " + numbers[count];
		}
		traverseOrder.setText(order);
		count++;
	}
	
	public void next6(ActionEvent event)
	{
		for(int i = 0; i < i1.length; i++){
			i1[i].setVisible(false);
		}
		description7.setVisible(false);
	    inorderButton.setVisible(false);
	    next6.setVisible(false);
	    
	    preorderText.setVisible(true);
	    preorderButton.setVisible(true);
	    next7.setVisible(true);
	    inorder1.setVisible(true);
	    traverseOrder.setText("");
	    count = 1;
	}
	
	public void preorderTraversal(ActionEvent event)
	{
		int[] numbers = new int[] {0,8,3,1,6,10,14,13};
		if(count == 8){
			count = 1;
			i2[7].setVisible(false);
		}
		i2[count - 1].setVisible(false);
		i2[count].setVisible(true);
		if(count == 1){
			order = "" + numbers[count];
		}
		else{
			order += ", " + numbers[count];
		}
		traverseOrder.setText(order);
		count++;
		    
			
	}
	
	public void next7()
	{
		for(int i = 0; i < i2.length; i++){
			i2[i].setVisible(false);
		}
		preorderText.setText("Postorder Traversal");
	    preorderButton.setVisible(false);
	    next7.setVisible(false);
	    
	    inorder1.setVisible(true);
	    traverseOrder.setText("");
	    next8.setVisible(true);
	    postorderButton.setVisible(true);
	    count = 1;
	    
	        
	}
	
	public void postorderTraversal(ActionEvent event)
	{
		int[] numbers = new int[] {0,1,6,3,13,14,10,8};
		if(count == 8){
			count = 1;
			i3[7].setVisible(false);
		}
		i3[count - 1].setVisible(false);
		i3[count].setVisible(true);
		if(count == 1){
			order = "" + numbers[count];
		}
		else{
			order += ", " + numbers[count];
		}
		traverseOrder.setText(order);
		count++;
	}
	
	/**
	 * goes to min/max page when clicked
	 */
	public void next8(ActionEvent event)
	{
		count = 0;
		traverseOrder.setText("");
		traverseOrder.setVisible(false); //box with traverse numbers to invis
		preorderText.setText("Minimum and Maximum");
	    next8.setVisible(false);
	    postorderButton.setVisible(false);
	    description1.setText("In order to find the minimum value in a tree, one must look at the"
	    		+ " left-most value. Similarly, in order to find the maximum value in a tree, one must"
	    		+ " look at the right most value. In the tree above, the minimum is shown in red and "
	    		+ " the maximum in orange.");
	    description1.setVisible(true);
	    inorder5.setVisible(false);
	    minandmax.setVisible(true);
	    next9.setVisible(true);
	   
	        
	}
	
	public void next9(ActionEvent event)
	{   inorder5.setVisible(false);
		next8.setVisible(false);
		preorderText.setText("Leaf Nodes");
		preorderText.setVisible(true);
	    description1.setText("Leaf nodes in a tree are those that do not contain any children. In the tree"
	    		+ " above, the leaf nodes are shown in yellow");
	    description1.setVisible(true);
	    minandmax.setVisible(false);
	    leafs.setVisible(true);
	   
	        
	}
	
	public void getDepth(ActionEvent event){
		if(tree1.root != null){
			int number = Integer.parseInt(depthBox.getText());
			int depth = tree1.depth(number);
			answer.setText("The depth of that node is : " + depth);
		}else{
			answer.setText("Sorry, your tree is empty, please add some nodes first.");
		}
		
		
	}
	
	public void getHeight(ActionEvent event){
		if(tree1.root == null){
			int height = tree1.height();
			answer.setText("The height of your tree is : " + height);
		}else{
			answer.setText("Sorry, your tree is empty, please add some nodes first.");
		}
		
	}
	
	public void getResult(ActionEvent event){
		if(tree1.root != null){
			String s = "";
			answer.setText(s);
			if (dropDown.getValue() == "PreOrder") {
				s = "The PreOrder traversal for your tree is: "
						+ tree1.preOrder(tree1.root);
			} else if (dropDown.getValue() == "InOrder") {
				s = "The InOrder traversal for your tree is: "
						+ tree1.inOrder(tree1.root);
			} else if (dropDown.getValue() == "PostOrder") {
				s = "The PostOrder traversal for your tree is: "
						+ tree1.postOrder(tree1.root);
			} else if (dropDown.getValue() == "Get Min") {
				s = "The minimum value in your tree is: " + tree1.getMin();
			} else if (dropDown.getValue() == "Get Max") {
				s = "The maximum value in your tree is: " + tree1.getMax();
			} else if (dropDown.getValue() == "Leafs") {
				s = "The leafs of your tree are: " + tree1.getLeafs(tree1.root);
			} else if (dropDown.getValue() == "Parent-Child") {
				s = tree1.printChildRelations(tree1.root);
			}
			answer.setText(s);
		}
		else{
			answer.setText("Sorry, your tree is empty, please add some nodes first.");
		}
		
	}
	
	public void deleteNode(ActionEvent event){
		
	}
	
	
}