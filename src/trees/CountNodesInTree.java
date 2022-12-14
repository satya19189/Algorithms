package trees;


public class CountNodesInTree {
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		n1.left = n2;
		int valueX = (int) Math.rint(6.5);
		System.out.println(valueX);
		TreeNode n3 = new TreeNode(3);
		n1.right = n3;
		TreeNode n4 = new TreeNode(4);
		n2.left = n4;
		TreeNode n5 = new TreeNode(5);
		n2.right = n5;
		TreeNode n6 = new TreeNode(6);
		n3.left = n6;
		TreeNode n7 = new TreeNode(7);
		n3.right = n7;
		TreeNode n8 = new TreeNode(8);
		n4.left = n8;
		TreeNode n9 = new TreeNode(9);
		n4.right = n9;
		TreeNode n10 = new TreeNode(10);
		n5.left = n10;
		TreeNode n11 = new TreeNode(11);
		n5.right = n11;
		TreeNode n12 = new TreeNode(12);
		n6.left = n12;
		TreeNode n13 = new TreeNode(13);
		n6.right = n13;
		TreeNode n14 = new TreeNode(14);
		n7.left = n14;
		TreeNode n15 = new TreeNode(15);
		n7.right = n15;
		System.out.println(countNodes(n1));
	}
	
	public static int countNodes(TreeNode root) {
		int count = 0;
		if( root == null)
			return 0;
		//while(root != null) {
			count++;
			if(root.left != null) {
				count = count + countNodes(root.left);
			}
			if(root.right != null) {
				count = count + countNodes(root.right);
			}
		//}
        
		return count;
    }
	
	public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode() {}
		 TreeNode(int val) { this.val = val; }
		 TreeNode(int val, TreeNode left, TreeNode right) {
		     this.val = val;
		     this.left = left;
		     this.right = right;
		 }
	}

}


