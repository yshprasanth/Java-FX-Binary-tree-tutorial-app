package controller;

/**
 * Maintains a node in a binary search tree.
 * All methods in this class were coded by both Rachelle
 * Tobkes and Daniel Alvarez together.
 *
 */
public class TreeNode{
	
	public int info; // the value
	public TreeNode left, right, parent;
	public double cX, cY, tX, tY, eX, tEY, bEY;// circle, text, and edge coordinates
	
	/**
	 * Constructor for a node sets all line, circle,
	 * and text coordinates to 0.
	 * @param info the value of the node.
	 */
	public TreeNode(int info){
		this.info = info;
		left = null;
		right = null;
		parent = null;
		cX = 0;
		cY = 0;
		tX = 0;
		tY = 0;
		eX = 0;
		tEY = 0;
		bEY = 0;
	}
	
	/**
	 * Determines if a node is a leaf if both children
	 * are null.
	 * @return true or false if node is a leaf.
	 */
	public boolean isLeaf()
    {
        return right == null && left == null;
    }

        
	

}