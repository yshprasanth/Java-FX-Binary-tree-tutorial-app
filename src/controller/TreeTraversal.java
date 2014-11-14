package controller;

/**
 * Class for tree traversals. All methods in this class
 * were coded by both Daniel Alvarez and Rachelle Tobkes.
 */
public class TreeTraversal {

	/**
	 * Prints out each node using Preorder traversal
	 * @param root the root of the tree
	 */
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.println(root.info + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	/**
	 * Prints out each node using Inorder traversal
	 * @param root the root of the tree
	 */
	public void inOrder(TreeNode root) {

		if (root != null) {
			inOrder(root.left);
			System.out.println(root.info + " ");
			inOrder(root.right);
		}

	}

	/**
	 * Prints out each node using Postorder traversal
	 * @param root the root of the tree
	 */
	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.info + " ");
		}

	}

}