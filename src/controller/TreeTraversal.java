package controller;
public class TreeTraversal
{
	public String preOrder(TreeNode root){
		String s = "";
		return preOrderHelper(s, root);
	}
	
	private String preOrderHelper(String s, TreeNode root)
	{
		if(root != null)
		{
			s += (root.info + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
		return s;
	}
	
	
	public void inOrder(TreeNode root)
	{
		         
		if(root != null)
		{
			inOrder(root.left);
			System.out.println(root.info + " ");
			inOrder(root.right);
		}
		
	}
	
	public void postOrder(TreeNode root)
	{		
		if(root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.info + " ");
		}
		
	}
	
	
	

	
	
	
	
}