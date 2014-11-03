package controller;

/**
 * This class implements the structure of a Binary Search Tree
 * to be used in the "Free Zone" and tutorial in our GUI.
 * ALL methods in this class were coded by both Rachelle Tobkes 
 * and Daniel Alvarez together.
 */
public class Tree {

	// create instance variables
	public TreeNode root;  
	private int height;     
	private int count;

	/**
	 * Creates an empty tree with the root being null and a height of 0.
	 */
	public Tree() {
		root = null;
		height = 0;
	}

	/**
	 * Helper method to get a subtree of a tree
	 * @param node the node whose subtree we want
	 * @return the subtree
	 */
	public Tree sub(TreeNode node) {
		Tree t = new Tree(); // create a new tree
		subTree(node, t);    // call subtree
		return t;            // return the subtree
	}
    /**
     * Gets the subtree from a given node
     * @param node the node whose subtree we want
     * @param t the new tree
     */
	public void subTree(TreeNode node, Tree t) {
		if (node != null) {
			t.add(node.info); // add the info to a new tree
			subTree(node.left, t);  // call subtree recursively 
			subTree(node.right, t);
		}
	}

	/**
	 * A helper method to add nodes to a BST in the correct 
	 * positions. Sets up the coordinates for each node to
	 * be drawn in the GUI.
	 * @param the value to be inserted
	 */
	public void add(int x) {
		root = add(root, x, 600, 100, 589, 105);
		root.bEY = root.cY + 20;  // root has larger radius therefore its edge
								 // differs
	}

	/**
	 * Adds nodes to a binary search tree as well as sets the coordinates
	 * of the circles and lines to be drawn in our GUI. Also
	 * links the nodes to its parent node. The coordinates are set
	 * depending the tree levels (depth).
	 */
	public TreeNode add(TreeNode node, int x, double cX, double cY, double tX,
			                                                      double tY) {
		// create a node with the given number 
		TreeNode temp = new TreeNode(x);
		
		if (node == null) { // if we reached a null node where 
			                // node should be added.
			
			node = temp;
			node.cX = cX;  // set x-coordinate of circle
			node.cY = cY;  // set y-coordinate of circle
			node.tX = tX;  // set x-coordinate of text box
			node.tY = tY;  // set y-coordinate of text box
			node.eX = cX;   // set x-coordinate of line
			node.tEY = cY - 15; 
			node.bEY = cY + 15;
			

		} else if (x < node.info) { // value less than root
			
			node.left = add(node.left, x, cX - (200 / depthN(node) * 1.1),
					  cY + 55, tX - (200 / depthN(node) * 1.1), tY + 55);
			
			node.left.parent = node; // link to parent
		
		} else if (x > node.info) {  // value greater than root
			
			node.right = add(node.right, x, cX + (200 / depthN(node) * 1.1),
					cY + 55, tX + (200 / depthN(node) * 1.1), tY + 55);
			
			node.right.parent = node; // link to parent 
		}
		
		return node;

	}

   
	/**
	 * Depth method to be used to calculate the coordinates of 
	 * the nodes for our GUI. This is only used in the add method.
	 * @param node the node whose depth we want
	 * @return the depth
	 */
	private double depthN(TreeNode node) {
		if (node == root) {
			return 0.8;
		}
		double count = 1.0;
		TreeNode current = root;
		while (node.info != current.info) // while value isn't found
		{
			if (node.info < current.info) // value less than current's data
			{
				count++; // increment depth
				current = current.left; // go to the left
			} else {
				count++; // increment depth
				current = current.right; // go to the right
			}
		}
		return count;

	}

	/**
	 * Calculates the depth of a node
	 * @param value the value we want the depth of
	 * @return the depth
	 */
	public int depth(int value) {
		int count = 0;

		if (!contains(value)) // value not in tree
		{
			return -1;
		}

		if (root == null) // tree is empty
		{
			return -2;
		} else {
			TreeNode current = root;

			while (value != current.info) // while value isn't found
			{
				if (value < current.info) // value less than current's data
				{
					count++; // increment depth
					current = current.left; // go to the left
				} else {
					count++; // increment depth
					current = current.right; // go to the right
				}
			}
		}

		return count;
	}

	/**
	 * Helper method to calculate the height of a tree
	 * @return the height
	 */
	public int height() {
		height = 0;
		height(root);
		height = height + 1;

		return height;
	}

	/**
	 * Calculates the height of a tree
	 * by finding the largest depth in the tree.
	 * @param root the root of the tree
	 */
	public void height(TreeNode root) {
		if (root != null) {
			height(root.left);

			if (depth(root.info) > height) {
				height = depth(root.info);
			}

			height(root.right);
		}

	}

	/**
	 * Finds the maximum value in the tree
	 * @return the maximum
	 */
	public int getMax() {
		
		TreeNode temp = root;

		while (temp.right != null) { // while we can go to the right
			temp = temp.right;       // go to the right
		}

		return temp.info;
	}

	/**
	 * Finds the minimum in a tree
	 * @return the minimum value
	 */
	public int getMin() {
		
		TreeNode temp = root;
		
		while (temp.left != null) { // while there is a left node
			temp = temp.left; // go to the left
		}

		return temp.info;
	}

	/**
	 * Returns true or false according to if a given value is 
	 * in the tree, uses binary search method.
	 * @param value the value we/re looking for
	 * @return true or false 
	 */
	public boolean contains(int value) {
		return !(binarySearch(value) == null);
	}

	/**
	 * Searches for a value in the tree and returns the node containing that
	 * value
	 * 
	 * @param value
	 *            the value we're looking for
	 * @return the node with the specified value
	 */
	public TreeNode binarySearch1(int value) {
		if (!contains(value) || root == null) {// not in tree or empty tree
			return null;
		}

		TreeNode current = root;
		while (value != current.info) {
			if (value < current.info) {
				current = current.left;
			} else {
				current = current.right;
			}
		}

		return current;
	}

	/**
	 * Binary search helper method
	 * @param value the value to search for
	 * @return the node if found or null if not found
	 */
	public TreeNode binarySearch(int value) {
		return binarySearch(root, value);
	}

	/**
	 * Searches for a node in the tree
	 * @param root the root of the tree
	 * @param value the value we're looking for
	 * @return the node containing the value
	 */
	public TreeNode binarySearch(TreeNode root, int value) {
		
		TreeNode current = root;
		
		if (root == null) {
			return null;
		}
		if (value < current.info && current.left != null) {
			current = binarySearch(current.left, value);
		} else if (value > current.info && current.right != null) {
			current = binarySearch(current.right, value);
		}
		if (current != null && current.info != value)
			return null;
		return current;
	}

	/**
	 * Returns a string containing the path to a node
	 * @param value the value whose path we want
	 * @return the path of the tree in a string
	 */
	public String getPath(int value) {
		
		// find the node
		TreeNode node = binarySearch(value);

		String s = "";

		if (!contains(value)) // value doesnt exist
		{
			return "Sorry that value is not in the tree.";
		}

		if (root == null) // empty tree
		{
			return "";
		}

		TreeNode current = root;

		while (node != current) {
			if (value < current.info) {
				s += current.info + " --> ";
				current = current.left;
			} else {
				s += current.info + " --> ";
				current = current.right;
			}
		}

		s += current.info;
		
		return s;

	}

	/**
	 * Helper method to determine the leaves in a tree
	 * @param root the root of the tree
	 * @return the string containing the leaves the a tree
	 */
	public String getLeafs(TreeNode root) {
		String s = "";
		return getLeafs(s, root);
	}

	/**
	 * Creates a string stating the leafs of the tree.
	 * @param s the string
	 * @param root the root of the tree
	 * @return the final string
	 */
	public String getLeafs(String s, TreeNode root) {
		if (root != null) {
			s += getLeafs(root.left);
			if (root.isLeaf()) // if node is a leaf
			{
				s += root.info + " ";
			}
			s += getLeafs(root.right);
		}
		
		return s;  // return the string

	}

	/**
	 * Helper method to print the child relations in a tree.
	 * @param root the root of the tree
	 * @return the sting of the child relations
	 */
	public String printChildRelations(TreeNode root) {
		String s = "";
		return printChildRelations(s, root);
	}

	/**
	 * Creates a string of whom the nodes are a child of
	 * and returns it.
	 * @param s the string
	 * @param root the root of the tree
	 * @return the final string
	 */
	public String printChildRelations(String s, TreeNode root) {
		if (root != null) {
			s += printChildRelations(root.left);
			if (root.parent != null) // if node is a leaf
			{
				s += root.info + " is the child of " + root.parent.info + ", ";
			}
			s += printChildRelations(root.right);
		}
		return s; // return the string

	}

	/**
	 * A helper method for the preOrder method.
	 * @param root the root of he tree
	 * @return the string in a preorder fashion
	 */
	public String preOrder(TreeNode root) {
		String s = "";
		return preOrder(s, root);
	}

	/**
	 * Creates a string of the values in the tree
	 * in a preOrder fashion.
	 * @param s the string
	 * @param root the root of the tree
	 * @return the final string
	 */
	private String preOrder(String s, TreeNode root) {
		if (root != null) {
			s += (root.info + " ");
			s += preOrder(root.left);
			s += preOrder(root.right);
		}
		
		return s; // return the string
	}

	/**
	 * A helper method for the inorder method
	 * @param root the root of the tree
	 * @return the string in a inorder fashion
	 */
	public String inOrder(TreeNode root) {
		String s = "";
		return inOrder(s, root);
	}

	/**
	 * Creates a string of the values in the tree
	 * in an inorder fashion
	 * @param s the string
	 * @param root the root of the tree
	 * @return the final string
	 */
	private String inOrder(String s, TreeNode root) {
		if (root != null) {
			s += inOrder(root.left);
			s += (root.info + " ");
			s += inOrder(root.right);
		}
		return s;  // return the string
	}

	/**
	 * Helper method for the postOrder method
	 * @param root the root of the tree
	 * @return
	 */
	public String postOrder(TreeNode root) {
		String s = "";
		return postOrder(s, root);
	}

	/**
	 * Creates a string of the numbers in the tree
	 * in a postorder fashion.
	 * @param s the string
	 * @param root the root of the tree
	 * @return the final string
	 */
	private String postOrder(String s, TreeNode root) {
		if (root != null) { 
			s += postOrder(root.left);
			s += postOrder(root.right);
			s += (root.info + " ");
		}
		
		return s; // returns the string
	}
	
	public int size()
	{
		return count;
	}
	
	public void delete(int value) {
	    root = delete(root, value);
	}

	private TreeNode delete(TreeNode root, int value) {
	    if (root == null) {
	        return null;
	    } else if (root.info > value) {
	        root.left = delete(root.left, value);
	    } else if (root.info < value) {
	        root.right = delete(root.right, value);
	    } else {  // root.data == value; remove this node
	        if (root.right == null) {
	            return root.left;    // no R child; replace w/ L
	        } else if (root.left == null) {
	            return root.right;   // no L child; replace w/ R
	        } else {
	            // both children; replace w/ min from R
	            root.info = getMin(root.right);
	            root.right = delete(root.right, root.info);
	        }
	    }
	   return root; 
	}
	    
	    public int getMin(TreeNode temp) {
			
			
			while (temp.left != null) { // while there is a left node
				temp = temp.left; // go to the left
			}

			return temp.info;
		}


}