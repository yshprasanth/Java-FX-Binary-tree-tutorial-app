package controller;

public class TreeNode{
	
	public int info;
	public TreeNode left, right, parent;
	public double cX, cY, tX, tY;   // circle and text coordinates
	
	public TreeNode(int info){
		this.info = info;
		left = null;
		right = null;
		parent = null;
		cX = 0;
		cY = 0;
		tX = 0;
		tY = 0;
	}
	
	
	public TreeNode(int info, TreeNode left, TreeNode right, TreeNode parent){
		this.info = info;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}
        
        public boolean isLeaf()
        {
            return right == null && left == null;
        }
	
	

}