
package controller;

/**
 * This class controls the GUI. All methods were created
 * by both Daniel Alvarez and Rachelle Tobkes together.
 */

// list of imports 
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

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
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Controller implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// circle array for tutorial 
		c = new Circle[] { circle1, circle2, circle3, circle4, circle5,
				circle6, circle7, circle8, circle9, circle10, circle11,
				circle12, circle13, circle14, circle15, circle16, circle17 };
		// text array for tutorial
		t = new Text[] { value1, value2, value3, value4, value5, value6,
				value7, value8, value9, value10, value11, value12, value13,
				value14, value15, value16, value17 };
		// line array for tutorial
		l = new Line[] { line1, line2, line3, line4, line5, line6, line7,
				line8, line9, line10, line11, line12, line13, line14, line15,
				line16 };
		// circle array for free zone
		c1 = new Circle[] { circle18, circle21, circle31, circle41, circle51,
				circle61, circle71, circle81, circle91, circle101, circle111,
				circle121, circle131, circle141, circle151, circle161,
				circle171 };
		// text array for free zone
		t1 = new Text[] { value18, value21, value31, value41, value51, value61,
				value71, value81, value91, value101, value111, value121,
				value131, value141, value151, value161, value171 };
		// line array for free zone
		l1 = new Line[] { line17, line21, line31, line41, line51, line61,
				line71, line81, line91, line101, line111, line121, line131,
				line141, line151, line161 };
		// array of inorder pictures
		i1 = new ImageView[] { inorder1, inorder2, inorder3, inorder4,
				inorder5, inorder6, inorder8, inorder7 };
		// array of preorder pictures
		i2 = new ImageView[] { inorder1, inorder5, inorder3, inorder2,
				inorder4, inorder6, inorder7, inorder8 };
		// array of postorder pictures
		i3 = new ImageView[] { inorder1, inorder2, inorder4, inorder3,
				inorder8, inorder7, inorder6, inorder5 };
		// manages the drop down menu int he free zone
		dropDown.setItems(FXCollections.observableArrayList("PreOrder",
				"InOrder", "PostOrder", "Get Min", "Get Max", "Leafs",
				"Parent-Child"));

	}

	private AudioClip wrong = new AudioClip("http://www.moviewavs.com/0093058674/MP3S/Movies/Napoleon_Dynamite/dang.mp3");
	private AudioClip right = new AudioClip("http://www.moviewavs.com/0093058674/MP3S/Movies/Napoleon_Dynamite/sweet.mp3");
	private AudioClip add = new AudioClip("http://www.pachd.com/a/button/button1.wav");
	private AudioClip deleteSound = new AudioClip("http://www.pachd.com/a/button/button2.wav");
	private AudioClip select = new AudioClip("http://www.pachd.com/a/button/button20.wav");
	private AudioClip clearSound = new AudioClip("http://www.pachd.com/a/button/button28.wav");
	
	@FXML // drop down instance variable
	private ChoiceBox<String> dropDown; // drop down for traversal choices
	
	@FXML  // all buttons used in the GUI
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
	private Button next10;
	@FXML
	private Button next11;
	@FXML
	private Button next12;
	@FXML
	private Button next13;
	@FXML
	private Button restart;
	@FXML
	private Button subtreeButton;
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
	private Button pathButton;
	@FXML
	private Button q1Button;
	@FXML
	private Button q2Button;
	@FXML
	private Button q3Button;
	@FXML
	private Button q4Button;
	@FXML
	private Button q5Button;
	@FXML
	private Button q6Button;
	@FXML
	private Button q7Button;
	@FXML
	private Button q8Button;
	@FXML
	private Button q9Button;
	@FXML
	private Button q10Button;
	@FXML
	private Button reset;
	
	@FXML  //text fields used in the GUI
	private TextField numberBox, numberBox1, depthBox, answer, pathBox, q1Ans,
			q2Ans, q3Ans, q4Ans, q5Ans, q6Ans, q7Ans, q8Ans, q9Ans, q10Ans;
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
	private Text pathText;
	@FXML
	private Text Balanced;
	@FXML
	private Text Unbalanced;
	@FXML
	private Text insText;
	@FXML
	private Text q1Text;
	@FXML
	private Text q2Text;
	@FXML
	private Text q3Text;
	@FXML
	private Text q4Text;
	@FXML
	private Text q5Text;
	@FXML
	private Text q6Text;
	@FXML
	private Text q7Text;
	@FXML
	private Text q8Text;
	@FXML
	private Text q9Text;
	@FXML
	private Text q10Text;
	@FXML
	private Text quizText;
	@FXML
	private Circle circle1, circle2, circle3, circle4, circle5, circle6,
			circle7, circle8, circle9, circle10, circle11, circle12, circle13,
			circle14, circle15, circle16, circle17, circle18, circle21,
			circle31, circle41, circle51, circle61, circle71, circle81,
			circle91, circle101, circle111, circle121, circle131, circle141,
			circle151, circle161, circle171;

	@FXML
	private Text value1, value2, value3, value4, value5, value6, value7,
			value8, value9, value10, value11, value12, value13, value14,
			value15, value16, value17, value18, value21, value31, value41,
			value51, value61, value71, value81, value91, value101, value111,
			value121, value131, value141, value151, value161, value171,
			description7, preorderText;

	@FXML
	private Line line1, line2, line3, line4, line5, line6, line7, line8, line9,
			line10, line11, line12, line13, line14, line15, line16, line17,
			line21, line31, line41, line51, line61, line71, line81, line91,
			line101, line111, line121, line131, line141, line151, line161;

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
	@FXML
	private ImageView path;
	@FXML
	private ImageView unbalancedTree;
	@FXML
	private ImageView balancedTree;
	@FXML
	private ImageView delete;
	@FXML
	private ImageView quizTree;
	@FXML
	private ImageView xMark;
	@FXML
	private ImageView checkMark;

	
	private Circle[] c, c1;
	private Text[] t, t1;
	private Line[] l, l1;
	private Tree tree = new Tree();
	private Tree tree1 = new Tree();
	private ImageView[] i1, i2, i3;
	private int arrayPos = 0;
	private int arrayPos1 = 0;

	/**
	 * Helper method to add and paint the nodes in the GUI.
	 * @param event clicking "add" button in tutorial portion
	 */
	public void addNumber(ActionEvent event) {
		add.play();
		if (!checkInput(numberBox))
			return;
		String temp = numberBox.getText(); // get the number entered
		
		if(!checkInput(numberBox)) // verify input 
			return;
		
		// add number if it doesn't already exist
		if (!tree.contains(Integer.parseInt(temp))) {
			add(temp);

		} else { // number exists
			JOptionPane.showMessageDialog(null,
					"Sorry you cannot enter the same number more than once");
		}
	}

	/**
	 * Adds and paints the node in the GUI tutorial portion
	 * @param temp the number to be painted
	 */
	private void add(String temp) {
		
		// add the the number to the tree
		tree.add(Integer.parseInt(temp));
		
		// get the node from the tree
		TreeNode current = tree.binarySearch(Integer.parseInt(temp));

		// set all the coordinates and make node visible
		c[arrayPos].setLayoutX(current.cX);
		c[arrayPos].setLayoutY(current.cY);
		t[arrayPos].setLayoutX(current.tX);
		t[arrayPos].setLayoutY(current.tY);
		t[arrayPos].setText(temp);
		c[arrayPos].setVisible(true);
		t[arrayPos].setVisible(true);
		
		if (arrayPos > 0) {  //for the lines

			// set all line coordinates and make visible
			l[arrayPos - 1].setLayoutX(-1);
			l[arrayPos - 1].setLayoutY(-1);
			l[arrayPos - 1].setEndX(current.eX);
			l[arrayPos - 1].setEndY(current.tEY);
			l[arrayPos - 1].setStartX(current.parent.eX);
			l[arrayPos - 1].setStartY(current.parent.bEY);
			l[arrayPos - 1].setVisible(true);

		}
		
		arrayPos++; //increment array position
	}

	/**
	 * To clear the painted tree from the screen
	 * in tutorial portion
	 * @param event "clear" button is pressed
	 */
	public void clear(ActionEvent event) {
		clearSound.play();
		// if tree isn't empty
		if (tree.root != null) {
			// make circles and text invisible
			for (int i = 0; i < c.length; i++) {
				c[i].setVisible(false);
				t[i].setVisible(false);
			}
			// make lines invisible
			for (int i = 0; i < l.length; i++) {
				l[i].setVisible(false);
			}
			// set root to null
			tree.root = null;
			arrayPos = 0; // set to 0

		}

		answer.setText(""); // clear answer box
	}

	
	/**
	 * Method to begin the tutorial
	 * @param event the "start" button is pressed,
	 * takes you to What is a BST page.
	 */
	public void start(ActionEvent event) {
		select.play();
		// make all images visible
		logo.setVisible(false);
		startButton.setVisible(false);
		authors.setVisible(false);
		whatisBST.setVisible(true);
		bst1.setVisible(true);
		description1.setVisible(true);
		next1.setVisible(true);
	}

	/**
	 * The first next button, takes you to
	 * what is NOT a BST page.
	 * @param event the "next" button is pressed
	 */
	public void next1(ActionEvent event) {
		select.play();
		// make all images visible
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

	/**
	 * second next button, takes you to build 
	 * your own BST page.
	 * @param event next button is pressed
	 */
	public void next2(ActionEvent event) {
		select.play();
		// set all images visible 
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

	/**
	 * The third next button, takes you to the height
	 * and depth page.
	 * @param event the next button is pressed
	 */
	public void next3(ActionEvent event) {
		select.play();
		description3.setVisible(false);
		addButton.setVisible(false);
		clear.setVisible(false);
		numberBox.setVisible(false);
		numberLabel.setVisible(false);
		next3.setVisible(false);
		for (int i = 0; i < c.length; i++) {// reset circles and numbers to
											// invis
			c[i].setVisible(false);
			t[i].setVisible(false);
		}
		for (int i = 0; i < l.length; i++) {// reset lines to invis
			l[i].setVisible(false);
		}

		heightT.setVisible(true);
		depthT.setVisible(true);
		bst4.setVisible(true);
		bst5.setVisible(true);
		description4.setVisible(true);
		next4.setVisible(true);

	}

	/**
	 * The fourth next button, takes you to the subtree
	 * page.
	 * @param event the nect button is pressed.
	 */
	public void next4(ActionEvent event) {
		select.play();
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
	
	/**
	 *  the fifth next button, takes you to the 
	 *  inorder traversal page.
	 * @param event the next button is pressed
	 */
	public void next5(ActionEvent event) {
		select.play();
		description5.setVisible(false);
		description6.setVisible(false);
		subTree.setVisible(false);
		next5.setVisible(false);

		description7.setVisible(true);
		inorderButton.setVisible(true);
		inorder1.setVisible(true);
		traverseOrder.setVisible(true);
		next6.setVisible(true);
	}

	int count = 1;  // count for the traversals
	String order = "";  // display box for the traversals 

	/**
	 * inorder traversal button, shows the user how 
	 * inorder traversal works by animating a BST.
	 * @param event the traverse button is pressed
	 */
	public void inorderTraversal(ActionEvent event) {
		add.play();
		// array for the traversal 
		int[] numbers = new int[] { 0, 1, 3, 6, 8, 10, 13, 14 };

		//reset traversal
		if (count == 8) {
			count = 1;
			i1[7].setVisible(false);
		}
		// set previous image invisible
		i1[count - 1].setVisible(false);
		// set next image visible
		i1[count].setVisible(true);
		
		if (count == 1) {
			order = "" + numbers[count];
		} else {
			order += ", " + numbers[count];
		}
		traverseOrder.setText(order);
		count++;
	}

	/**
	 * sixth next button, takes you to preorder
	 * traversal page.
	 * @param event the next button is pressed
	 */
	public void next6(ActionEvent event) {
		select.play();
		
		for (int i = 0; i < i1.length; i++) {
			i1[i].setVisible(false);
		}

		inorderButton.setVisible(false);
		next6.setVisible(false);
		description7.setText("PreOrder Traversal");
		preorderButton.setVisible(true);
		next7.setVisible(true);
		inorder1.setVisible(true);
		traverseOrder.setText("");
		count = 1;
	}

	/**
	 * traversal button to show the user how preorder traversal works
	 * @param event the traverse button is pressed.
	 */
	public void preorderTraversal(ActionEvent event) {
		add.play();
		// array with preorder numbers
		int[] numbers = new int[] { 0, 8, 3, 1, 6, 10, 14, 13 };
		
		//reset traversal
		if (count == 8) {
			count = 1;
			i2[7].setVisible(false);
		}
		// set prev picture invisible
		i2[count - 1].setVisible(false);
		// set next picture visible
		i2[count].setVisible(true);
		if (count == 1) {
			order = "" + numbers[count];
		} else {
			order += ", " + numbers[count];
		}
		traverseOrder.setText(order);
		count++;

	}

	/**
	 * Seventh next button that takes you to the postorder
	 * traversal page
	 */
	public void next7() {
		select.play();
		for (int i = 0; i < i2.length; i++) {
			i2[i].setVisible(false);
		}
		description7.setText("PostOrder Traversal");
		preorderButton.setVisible(false);
		next7.setVisible(false);
		inorder1.setVisible(true);
		traverseOrder.setText("");
		next8.setVisible(true);
		postorderButton.setVisible(true);
		count = 1;

	}

	/**
	 * Postorder traversal button to demonstrate how postorder
	 * traversal works.
	 * @param event the traverse button is pressed.
	 */
	public void postorderTraversal(ActionEvent event) {
		add.play();
		// array for postorder numbers
		int[] numbers = new int[] { 0, 1, 6, 3, 13, 14, 10, 8 };
		// reset traversal
		if (count == 8) {
			count = 1;
			i3[7].setVisible(false);
		}
		// set prev picture invisible
		i3[count - 1].setVisible(false);
		// set next picture visivle
		i3[count].setVisible(true);
		if (count == 1) {
			order = "" + numbers[count];
		} else {
			order += ", " + numbers[count];
		}
		traverseOrder.setText(order);
		count++;
	}

	/**
	 * Eighth next button, takes you to min/max page when clicked.
	 * @param event the next button is pressed.
	 */
	public void next8(ActionEvent event) {
		select.play();
		// make pics from traversal invisible
		for (int i = 0; i < i3.length; i++) {
			i3[i].setVisible(false);
		}
		count = 0;
		traverseOrder.setText("");
		traverseOrder.setVisible(false); // box with traverse numbers to invis
		preorderText.setText("Minimum and Maximum");
		preorderText.setVisible(true);
		next8.setVisible(false);
		postorderButton.setVisible(false);
		description1
				.setText("In order to find the minimum value in a tree, one must look at the"
						+ " left-most value. Similarly, in order to find the maximum value in a tree, one must"
						+ " look at the right most value. In the tree above, the minimum is shown in red and "
						+ " the maximum in orange.");
		description1.setVisible(true);
		inorder5.setVisible(false);
		minandmax.setVisible(true);
		next9.setVisible(true);
		description7.setVisible(false);

	}

	/**
	 * Ninth next button, takes you to the leafs page.
	 * @param event the next button is pressed
	 */
	public void next9(ActionEvent event) {
		select.play();
		inorder1.setVisible(false);
		next8.setVisible(false);
		preorderText.setText("Leaf Nodes");
		preorderText.setLayoutX(530);
		preorderText.setVisible(true);
		description1
				.setText("Leaf nodes in a tree are those that do not contain any children. In the tree"
						+ " above, the leaf nodes are shown in yellow");
		description1.setVisible(true);
		minandmax.setVisible(false);
		leafs.setVisible(true);
		next9.setVisible(false);
		next10.setVisible(true);

	}

	/**
	 * Tenth next button, takes you to the paths page.
	 * @param event the next button is pressed
	 */
	public void next10(ActionEvent event) {
		select.play();
		preorderText.setText("Paths");
		preorderText.setLayoutX(574);
		description1
				.setText("Every node has a path that you need to follow in order to arrive at"
						+ " it. Follow the red arrows to see the path of"
						+ " the node containing 4. It has a path of 8, 3, 6, 4");
		minandmax.setVisible(false);
		next10.setVisible(false);
		path.setVisible(true);
		next9.setVisible(false);
		leafs.setVisible(false);
		next11.setVisible(true);
	}

	/**
	 * Eleventh next button, takes you to the parent-child page.
	 * page.
	 * @param event the next button is pressed.
	 */
	public void next11(ActionEvent event) {
		select.play();
		path.setVisible(false);
		path.setVisible(false);
		preorderText.setText("Child and Parent Relationships");
		preorderText.setLayoutX(390);
		inorder1.setVisible(true);
		description1
				.setText("Every node except the root has a parent node. Above, the root is the parent "
						+ "of 3 and 10, and 3 and 10 are its children. Both 3 and 10 are also parent nodes"
						+ " and contain their own children. The node containting 10 is the parent of the node containing 14, "
						+ " and the node containing 14 is a parent of the node 13.");
		next11.setVisible(false);
		next12.setVisible(true);

	}

	/**
	 * The 12th next button, takes you to the unbalanced/balanced page.
	 * @param event the next button is pressed
	 */
	public void next12(ActionEvent event) {
		select.play();
		preorderText.setText("Unbalanced VS Balanced Trees");
		inorder1.setVisible(false);
		description1
				.setText("An unbalanced Binary Search Tree is one where a leaf is much"
						+ " farther away from the root than any other leaf. For example, on the left, the leaf "
						+ "containing 13 is much farther away from the root than the leaf containing 3. A balanced"
						+ " Binary Search Tree is shown on the right where no leaf is farther away "
						+ "from the root than any other leaf.");
		unbalancedTree.setVisible(true);
		balancedTree.setVisible(true);
		Balanced.setVisible(true);
		Unbalanced.setVisible(true);
		next12.setVisible(false);
		next13.setVisible(true);
	}

	/**
	 * The 13th next button, takes you to the deleting a node page.
	 * @param event the next button is pressed
	 */
	public void next13(ActionEvent event) {
		select.play();
		next13.setVisible(false);
		delete.setVisible(true);
		preorderText.setText("Deleting a Node from a Tree");
		unbalancedTree.setVisible(false);
		balancedTree.setVisible(false);
		Balanced.setVisible(false);
		Unbalanced.setVisible(false);
		restart.setVisible(true);
		description1
				.setText("To delete a node from a tree, there are 3 cases: deleting a leaf node by simply"
						+ " removing that node, deleting a node with one child by replacing it with its child, or "
						+ " deleteing a node that has two children by replcaing it with the smallest element "
						+ " in the right subtree or the largest element in the left subtree. For example, above we remove"
						+ " the node containing 3 by replacing it with the only element in its right subtree (6) which is "
						+ " considered the smallest.");

	}

    /**
     * Button to restart the tutorial
     * @param event the restart button is pressed 
     */
	public void restart(ActionEvent event) {
		select.play();
		bst1.setVisible(true);
		restart.setVisible(false);
		delete.setVisible(false);
		next1.setVisible(true);
		whatisBST.setVisible(true);
		preorderText.setVisible(false);
		description1
				.setText("Every node in a Binary Search Tree must have at most two child nodes. As you can see, "
						+ "every number to the left of the root (green) is less than the root. Likewise, every number "
						+ "to the right of the root, is greater than the root.This same property is true for every other node"
						+ " in the Binary Search Tree.");
		count = 1;
		order = "";
		description7.setText("InOrder Traversal");

	}

	
	/**
	 * Helper method to add and paint the numbers in the GUI in the
	 * free mode portion.
	 * @param event the "add" button is pressed
	 */
	public void addNumber1(ActionEvent event) {
		add.play();
		// if proper input wasn't entered
		if (!checkInput(numberBox1))
			return;      // exit method

		// get the entered number
		int temp = Integer.parseInt(numberBox1.getText());
		
		// set answer box to blank
		answer.setText("");
		
		// if tree doesn't already contain number
		if (!tree1.contains(temp)) {
			add1(temp);  // add the number

		} else { // number already exists 
			JOptionPane.showMessageDialog(null,
					"Sorry you cannot enter the same number more than once");
		}
	}
    /**
     * Adds and paints the numbers in the GUI
     * @param temp the number to be added and painted
     */
	private void add1(int temp) {
        // add the number to tree
		tree1.add(temp);//add number to tree
		
		// get the node from the tree
		TreeNode current = tree1.binarySearch(temp);

		// set coordinates and make visible for node added to tree
		c1[arrayPos1].setLayoutX(current.cX);
		c1[arrayPos1].setLayoutY(current.cY);
		t1[arrayPos1].setLayoutX(current.tX);
		t1[arrayPos1].setLayoutY(current.tY);
		t1[arrayPos1].setText(temp + "");
		c1[arrayPos1].setVisible(true);
		t1[arrayPos1].setVisible(true);
		
		if (arrayPos1 > 0) { // for the lines

			// set coordinates and make visible
			l1[arrayPos1 - 1].setLayoutX(-1);
			l1[arrayPos1 - 1].setLayoutY(-1);
			l1[arrayPos1 - 1].setEndX(current.eX);
			l1[arrayPos1 - 1].setEndY(current.tEY);
			l1[arrayPos1 - 1].setStartX(current.parent.eX);
			l1[arrayPos1 - 1].setStartY(current.parent.bEY);
			l1[arrayPos1 - 1].setVisible(true);

		}
		
		arrayPos1++; // increment array position
	}
    
	/**
	 * Clear method for the free mode portion
	 * @param event the "clear" button is pressed
	 */
	public void clear1(ActionEvent event) {
		clearSound.play();
		// if the tree isn't empty
		if (tree1.root != null) {
			// make circles and text invisible
			for (int i = 0; i < c1.length; i++) {
				c1[i].setVisible(false);
				t1[i].setVisible(false);
			}
			// make lines invisible
			for (int i = 0; i < l.length; i++) {
				l1[i].setVisible(false);
			}
			// set root to null
			tree1.root = null;
			
			// set array position to 0
			arrayPos1 = 0;
		}

		
		// clear answer box
		answer.setText("");
	}

	
	
	/**
	 * Generates the depth of the user's tree
	 * @param event the depth button is pressed
	 */
	public void getDepth(ActionEvent event) {
		add.play();
		// verify the input
		if (!checkInput(depthBox))
			return;   
		// if the tree isn't empty
		if (tree1.root != null) {
			// get the number entered
			int number = Integer.parseInt(depthBox.getText());
			// calculate the depth
			int depth = tree1.depth(number);
			// entered invalid number
			if (depth == -1) {
				answer.setText("Sorry that node isn't in your tree");
			} else // print the depth
				answer.setText("The depth of that node is : " + depth);
		} else { // tree is empty
			answer.setText("Sorry, your tree is empty, please add some nodes first.");
		}

	}

	/**
	 * Generates the height of the user's tree/
	 * @param event the height button is pressed 
	 */
	public void getHeight(ActionEvent event) {
		add.play();
		// tree isn't empty
		if (tree1.root != null) {
			// calculate the height
			int height = tree1.height();
			// print the height
			answer.setText("The height of your tree is : " + height);
		} else { // tree is empty
			answer.setText("Sorry, your tree is empty, please add some nodes first.");
		}

	}

	/**
	 * Generates the a subtree from the tree.
	 * @param event the subtree button is pressed
	 */
	public void getSubtree(ActionEvent event) {
		
		add.play();
		// verify the input
		if (!checkInput(pathBox))
			return;

		int number = Integer.parseInt(pathBox.getText()); // get the value
															// entered
		// get the node from the tree
		TreeNode node = tree1.binarySearch(number);

		// if number doesn't exist 
		if (!tree1.contains(number)) {
			answer.setText("Sorry, that number isn't in the tree.");
			return;
		}

		if (tree1.root != null) { // clear previous tree
			answer.setText("");
			for (int i = 0; i < c1.length; i++) {
				c1[i].setVisible(false);
				t1[i].setVisible(false);
			}
			for (int i = 0; i < l.length; i++) {
				l1[i].setVisible(false);
			}
			// generate subtree
			tree1 = tree1.sub(node); // generate the subtree for that node
			String s = tree1.preOrder(tree1.root); // get string of nodes
			// create scanner from subtree
			Scanner scan = new Scanner(s);
			// set the root to null
			tree1.root = null;
			arrayPos1 = 0;

			// paint new tree
			while (scan.hasNext()) {
				int num = scan.nextInt();
				add1(num);
			}
			
			scan.close();
		}

	}

	/**
	 * Manages the drop down in the free mode.
	 * @param event a choice is selected from the drop down
	 */
	public void getResult(ActionEvent event) {
		add.play();
		if (tree1.root != null) {
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
			answer.setText(s); // print the answer 
		} else { // tree is empty
			answer.setText("Sorry, your tree is empty, please add some nodes first.");
		}

	}

	/**
	 * Generates and prints the path of the user;s tree/
	 * @param event the path button is pressed.
	 */
	public void getPath(ActionEvent event) {
		add.play();	

		if (!checkInput(pathBox)) // a digit wasn't entered
			return;
		// get the number entered
		int number = Integer.parseInt(pathBox.getText());
		// if the number exists
		if (tree1.contains(number)) {
			answer.setText("The path to your number is: "
					+ tree1.getPath(number));
		} else { // number doesn't exist
			answer.setText("Sorry, the number you entered is not in your tree.");
		}
	}

	
	public void deleteNode(ActionEvent event)
	{
		deleteSound.play();
		// verify the input
		if (!checkInput(numberBox1))
			return;

		int number = Integer.parseInt(numberBox1.getText()); // get the value
		// entered


		// if number doesn't exist 
		if (!tree1.contains(number)) {
			answer.setText("Sorry, that number isn't in the tree.");
			return;
		}

		// delete the number 
		tree1.delete(number);

		if (tree1.root != null) { // clear previous tree
			answer.setText("");
			for (int i = 0; i < c1.length; i++) {
				c1[i].setVisible(false);
				t1[i].setVisible(false);
			}
			for (int i = 0; i < l.length; i++) {
				l1[i].setVisible(false);
			}

			String s = tree1.preOrder(tree1.root); // get string of nodes
			// create scanner from subtree
			Scanner scan = new Scanner(s);
			// set the root to null
			tree1.root = null;
			arrayPos1 = 0;

			// paint new tree
			while (scan.hasNext()) {
				int num = scan.nextInt();
				add1(num);
			}

			scan.close();
		}



	}
	//used to keep track of total right answers
	int totalRight = 0;
	//used to keep track of wrong attempts per question
	int[] wrongCount = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	/**
	 * Methods to manage each quiz question.
	 * @param event the answer button is pressed.
	 */
	public void q1Answer(ActionEvent event) {

		if (q1Ans.getText().equalsIgnoreCase("T")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q1Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[0]++;
			wrong.play();
		}
		if (wrongCount[0] == 3) {
			q1Text.setText("Sorry the correct answer was: T");
			q1Button.setVisible(false);
			clearMarks();
		}
	}

	public void q2Answer(ActionEvent event) {

		if (q2Ans.getText().equals("2")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q2Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[1]++;
			wrong.play();
		}
		if (wrongCount[1] == 3) {
			q2Text.setText("Sorry the correct answer was: 2");
			q2Button.setVisible(false);
			clearMarks();
		}
	}

	public void q3Answer(ActionEvent event) {

		if (q3Ans.getText().equals("4")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q3Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[2]++;
			wrong.play();
		}
		if (wrongCount[2] == 3) {
			q3Text.setText("Sorry the correct answer was: 4");
			q3Button.setVisible(false);
			clearMarks();
		}
	}

	public void q4Answer(ActionEvent event) {

		if (q4Ans.getText().equalsIgnoreCase("M B F")
				|| q4Ans.getText().equalsIgnoreCase("M F B")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q4Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[3]++;
			wrong.play();
		}
		if (wrongCount[3] == 3) {
			q4Text.setText("Sorry the correct answer was: M B F");
			q4Button.setVisible(false);
			clearMarks();
		}
	}

	public void q5Answer(ActionEvent event) {

		if (q5Ans.getText().equalsIgnoreCase("D F R")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q5Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[4]++;
			wrong.play();
		}
		if (wrongCount[4] == 3) {
			q5Text.setText("Sorry the correct answer was: D F R");
			q5Button.setVisible(false);
			clearMarks();
		}
	}

	public void q6Answer(ActionEvent event) {

		if (q6Ans.getText().equalsIgnoreCase("B D E F G K M R")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q6Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[5]++;
			wrong.play();
		}
		if (wrongCount[5] == 3) {
			q6Text.setText("Sorry the correct answer was: B D E F G K M R");
			q6Button.setVisible(false);
			clearMarks();
		}
	}

	public void q7Answer(ActionEvent event) {

		if (q7Ans.getText().equalsIgnoreCase("D B F E R M K G")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q7Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[6]++;
			wrong.play();
		}
		if (wrongCount[6] == 3) {
			q7Text.setText("Sorry the correct answer was: D B F E R M K G");
			q7Button.setVisible(false);
			clearMarks();
		}
	}

	public void q8Answer(ActionEvent event) {

		if (q8Ans.getText().equalsIgnoreCase("G B D E F K M R")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q8Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[7]++;
			wrong.play();
		}
		if (wrongCount[7] == 3) {
			q8Text.setText("Sorry the correct answer was: G B D E F K M R");
			q8Button.setVisible(false);
			clearMarks();
		}
	}

	public void q9Answer(ActionEvent event) {

		if (q9Ans.getText().equalsIgnoreCase("G E B D")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q9Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[8]++;
			wrong.play();
		}
		if (wrongCount[8] == 3) {
			q9Text.setText("Sorry the correct answer was: G E B D");
			q9Button.setVisible(false);
			clearMarks();
		}
	}

	public void q10Answer(ActionEvent event) {

		if (q10Ans.getText().equalsIgnoreCase("B R")) {
			xMark.setVisible(false);
			checkMark.setVisible(true);
			q10Button.setVisible(false);
			totalRight++;
			quizText.setText(totalRight + "/10");
			right.play();
		} else {
			checkMark.setVisible(false);
			xMark.setVisible(true);
			wrongCount[9]++;
			wrong.play();
		}
		if (wrongCount[9] == 3) {
			q10Text.setText("Sorry the correct answer was: B R");
			q10Button.setVisible(false);
			clearMarks();
		}
	}

	/**
	 * Resets the quiz to the beginning.
	 * @param event the reset button is pressed.
	 */
	public void resetTest(ActionEvent event) {
		clearSound.play();
		q1Ans.setVisible(true);
		q1Button.setVisible(true);
		q1Ans.setText("");
		q1Text.setText("Is this a binary search tree? Enter T or F");

		q2Ans.setVisible(true);
		q2Button.setVisible(true);
		q2Ans.setText("");
		q2Text.setText("What is the depth of the node containing B?");

		q3Ans.setVisible(true);
		q3Button.setVisible(true);
		q3Ans.setText("");
		q3Text.setText("What is the height of the tree?");

		q4Ans.setVisible(true);
		q4Button.setVisible(true);
		q4Ans.setText("");
		q4Text.setText("Which node is the parent of the node containing R?"
				+ " Which are the children of the node containing E?"
				+ " (Enter three letters seperated by spaces)");

		q5Ans.setVisible(true);
		q5Button.setVisible(true);
		q5Ans.setText("");
		q5Text.setText("Which nodes are leaf nodes? (Enter from left to right seperated by spaces)");

		q6Ans.setVisible(true);
		q6Button.setVisible(true);
		q6Ans.setText("");
		q6Text.setText("What is the inorder traversal of the tree? (Enter numbers seperated by spaces)");

		q7Ans.setVisible(true);
		q7Button.setVisible(true);
		q7Ans.setText("");
		q7Text.setText("What is the postorder traversal of the tree? (Enter letters seperated by spaces)");

		q8Ans.setVisible(true);
		q8Button.setVisible(true);
		q8Ans.setText("");
		q8Text.setText("What is the preorder traversal of the tree? (Enter letters seperated by spaces)");

		q9Ans.setVisible(true);
		q9Button.setVisible(true);
		q9Ans.setText("");
		q9Text.setText("What is the path of the node containing D? (Enter letters seperated by spaces)");

		q10Ans.setVisible(true);
		q10Button.setVisible(true);
		q10Ans.setText("");
		q10Text.setText("What are the minimum and maximum of the tree? (Enter letters seperated by spaces)");

		clearMarks();
		quizText.setText("");
		totalRight = 0;

		for (int i = 0; i < wrongCount.length; i++) {// reset wrong answer
														// counter
			wrongCount[i] = 0;
		}

	}

	private void clearMarks() {// clear marks
		xMark.setVisible(false);
		checkMark.setVisible(false);
	}

	/**
	 * Checks if an integer was entered.
	 * @return true or false if an integer was entered
	 */
	public boolean checkInput(TextField t) {
		if (t.getText().equals("")) {
			answer.setText("Sorry, you need to enter a number");
			return false;
		}
		
		for (int i = 0; i < t.getText().length(); i++) { // make sure number was
															// entered
			if (!Character.isDigit((t.getText().charAt(i)))
					&& t.getText().charAt(i) != '-') {
				answer.setText("Sorry, you must enter a number");
				return false;
			}
		}
		return true; 
	}
	
	

}