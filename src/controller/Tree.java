package controller;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tree 
{
	
    // create instance variables
    public TreeNode root;
    private int height;

    /**
     * Creates an empty tree with the root being null and a height of 0.
     */
    public Tree() 
    {
        root = null; 
        height = 0;
    }

    /**
     * Creates a tree given a root and sets the height
     * @param root the root of the tree
     */
    public Tree(TreeNode node)
    {
        subTree(node);
    }
    
    public void subTree(TreeNode node)
	{
    	if(node!=null){
    		add(node.info);
    		subTree(node.left);
    		subTree(node.right);
    	}
	}	
    
    public void add(int x){
    	root = add(root, x, 600, 100, 589, 105);
    	root.bEY = root.cY + 20;// root has larger radius therefore its edge differs
    }
    
    public TreeNode add(TreeNode node, int x, double cX, double cY, double tX, double tY){
    	TreeNode temp = new TreeNode(x);
    	if(node == null){
    		node = temp;
    	
    		node.cX = cX;
    		node.cY = cY;
    		node.tX = tX;
    		node.tY = tY;
    		node.eX = cX;
    		node.tEY = cY - 15;
    		node.bEY = cY + 15;
    		
    	}
    	else if(x < node.info){
    			node.left = add(node.left, x, cX - (200/depthN(node)*1.1), cY + 55, tX - (200/depthN(node)*1.1), tY + 55);
    			node.left.parent = node;
    		}
    	else if(x > node.info){
    			node.right = add(node.right, x, cX + (200/depthN(node)*1.1), cY + 55, tX + (200/depthN(node)*1.1), tY + 55);
    			node.right.parent = node;
    		}
    	return node;
    	
    }
    
    public TreeNode getParent(int x){
    	TreeNode temp = binarySearch(x);
    	return temp.parent;
    }


    public void printInOrder() 
    {
        printInOrder(root);
    }

    private void printInOrder(TreeNode root) 
    {

        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.info + " ");
            printInOrder(root.right);
        }

    }

    
    private double depthN(TreeNode node){
    	if(node == root){
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
            } 
            else 
            {
                count++; // increment depth
                current = current.right; // go to the right
            }
        }
    	return count;
    	
    }

    /**
    * Calculates the depth of a node
    * @param value the node's value whose depth we want to find
    * @return the depth
    */
    public int depth(int value)
    {
        int count = 0;

        if (!contains(value)) // value not in tree
        {
            return -1;
        }

        if (root == null) // tree is empty
        {
            return -2;
        } 
        else
        {
            TreeNode current = root;
           
            while (value != current.info) // while value isn't found
            {
                if (value < current.info) // value less than current's data
                {
                    count++; // increment depth
                    current = current.left; // go to the left
                } 
                else 
                {
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
    public int height() 
    {
        height(root);
        
        height = height + 1;
        
        return height;
    }
    
    /**
     * Calculates the height of a tree
     * @param root the root of the tree
     */ 
    public void height(TreeNode root)
    {
        if (root != null)
        {
            height(root.left);
            
            if (depth(root.info) > height)
            {
                height = depth(root.info);
            }
            
            height(root.right);
        }

    }

    /**
     * Finds the maximum in the tree
     * @return the maximum
     */
    public int getMax()
    {
        TreeNode temp = root;
       
        while (temp.right != null)
        {
            temp = temp.right;
        }

        return temp.info;
    }

    /**
     * Finds the minimum in a tree
     * @return the minimum
     */
    public int getMin() 
    {
        TreeNode temp = root;
        while (temp.left != null) 
        {
            temp = temp.left;
        }

        return temp.info;
    }


    public boolean contains(int value){
    	return !(binarySearch(value) == null);
    }
    
    /**
     * Searches for a value in the tree and returns the node containing that
     * value
     * @param value the value we're looking for
     * @return the node with the specified value
     */
    public TreeNode binarySearch1(int value) 
    {
        if (!contains(value) || root == null){//not in tree or empty tree
            return null;
        }

        TreeNode current = root;
        while (value != current.info) 
        {
            if (value < current.info){
              current = current.left;
            } 
            else{
                current = current.right;
            }
        }

        return current;
    }
    
    /**
     * Binary search helper method
     * @param value
     * @return the node if found or null if not found
     */
    public TreeNode binarySearch(int value) 
    {
    	return binarySearch(root, value);
    }
    
    public TreeNode binarySearch(TreeNode root, int value) 
    {
    	TreeNode current = root;
    	if(root == null){
    		return null;
    	}
    	if(value < current.info && current.left != null){
    		current = binarySearch(current.left, value);
    	}
    	else if(value > current.info && current.right != null){
    		current = binarySearch(current.right, value);
    	}
    	if(current != null && current.info != value)
    		return null;
    	return current;
    }



   /**
    * Prints the path to a node
    * @param value the value whose path we want
    */
    public void printPath(int value)
    {
        // find the node
        TreeNode node = binarySearch(value);

        String s = "";

        if (!contains(value)) // value doesnt exist
        {
            return;
        }

        if (root == null) // empty tree
        {
            return;
        }

        TreeNode current = root;

        while (node != current) 
        {
            if (value < current.info) 
            {
                s = s + current.info + " ";
                current = current.left;
            } 
            else 
            {
                s = s + current.info + " ";
                current = current.right;
            }
        }

        System.out.println("The path is " + s + current.info);

    }



    /**
     * Helper method to print the leaves in a tree
     */
    public String getLeafs(TreeNode root) 
    {
    	String s = "";
        return getLeafs(s, root);
    }

    /**
     * Returns the leafs that are in a tree
     * @param root the root of the tree
     */
    public String getLeafs(String s, TreeNode root) 
    {
        if (root != null) 
        {
            s += getLeafs(root.left);
            if (root.isLeaf())  // if node is a leaf
            {   
                s += root.info + " ";
            }
            s += getLeafs(root.right);
        }
        return s;

    }
    
    public String printChildRelations(TreeNode root)
    {
    	String s = "";
        return printChildRelations(s, root);
    }
   
    public String printChildRelations(String s, TreeNode root)
    {
    	if (root != null) 
        {
            s += printChildRelations(root.left);
            if (root.parent != null)  // if node is a leaf
            {   
                s += root.info + " is the child of " + root.parent.info + ", ";
            }
            s += printChildRelations(root.right);
        }
        return s;

    }
    
	public String preOrder(TreeNode root){
		String s = "";
		return preOrderHelper(s, root);
	}
	
	private String preOrderHelper(String s, TreeNode root)
	{
		if(root != null)
		{
			s += (root.info + " ");
			s += preOrder(root.left);
			s += preOrder(root.right);
		}
		return s;
	}
    
    public String inOrder(TreeNode root){
		String s = "";
		return inOrderHelper(s, root);
	}
	
	private String inOrderHelper(String s, TreeNode root)
	{
		if(root != null)
		{
			s += inOrder(root.left);
			s += (root.info + " ");
			s += inOrder(root.right);
		}
		return s;
	}
	
	public String postOrder(TreeNode root){
		String s = "";
		return postOrderHelper(s, root);
	}
	
	private String postOrderHelper(String s, TreeNode root)
	{
		if(root != null)
		{
			s += postOrder(root.left);
			s += postOrder(root.right);
			s += (root.info + " ");
		}
		return s;
	}
	


    
    
    
//  /**
//  * Adds integers to the binary search tree in the correct positions.
//  * @param x the integer to be added
//  */
// public void add(int x) 
// {
//     // create new node with integer x as data
//     TreeNode temp = new TreeNode(x);
//    
//     TreeNode parent;
//
//     if (root == null) // tree is empty
//     {
//         root = temp; // make node the root
//     }
//     else // not empty
//     {
//         TreeNode current = root;
//
//         while(true) // while node hasn't found a position
//         {
//             parent = current;
//            
//             if (x < current.info) // data less than current data
//             {
//                 current = current.left; // go to the left
//                
//                 if (current == null) 
//                 {
//                     parent.left = temp; // attach the node
//                     return;
//                 }
//             } 
//             else // data greater than curent data
//             {  
//                 current = current.right; // go to the right
//                
//                 if (current == null) 
//                 {
//                     parent.right = temp; // attach the node
//                     return;
//                 }
//             }
//         }
//         
//     }
//     
//     height = height(); // update/calculate the height
// }
    
//  /**
//  * Determines if a certain integer is in the binary search tree
//  * @param value the value we're looking for
//  * @return true or false if it is found
//  */
// public boolean contains(int value)
// {
//     if (root == null)  // empty tree
//     {
//         System.out.println("The tree is empty");
//         
//     } 
//     else
//     {
//         TreeNode current = root;
//
//         while (value != current.info) 
//         {
//             if (value < current.info && current.left != null) 
//             {
//                 current = current.left;
//             } 
//             else 
//             {
//                 if (current.right != null) 
//                 {
//                     current = current.right;
//                 }
//             }
//
//             if (current.left == null && current.right == null) 
//             {
//                 break;
//             }
//         }
//         
//         if (value == current.info) 
//         {
//             return true;
//         }
//     }
//     
//     return false;
// }
    
    /**
//   * Create a subtree of a tree given a specified value
//   * @param value the value whose subtree we want
//   * @return  the subtree
//   */
//  public Tree subTree(int value)
//  {
//      // find node 
//      TreeNode node = binarySearch(value);
//
//      // create subtree
//      Tree sub = new Tree(node);
//
//      
//      
//      return sub;
//  }

}