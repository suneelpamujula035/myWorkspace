package com.dsa.binary_tree_search;

public class Day4_Puzzle_03 {

	int minSum;
	public void minSumFromRootToLeaf(Node node, int sum) {
		if (node == null) {
			return;
		}

		//max
//		if (node.left == null && node.right == null && sum + node.data > maxSum) {
//			maxSum = sum + node.data;
//			return;
//		}
//		maxSumFromRootToLeaf(node.left, sum + node.data);
//		maxSumFromRootToLeaf(node.right, sum + node.data);
		
		//min
		if (node.left == null && node.right == null) {
			if(sum+node.data<minSum)
			{
				minSum = sum + node.data;
			}
			return;
		}
		minSumFromRootToLeaf(node.left, sum - node.data);
		minSumFromRootToLeaf(node.right, sum - node.data);
	}

	public int minimumSum(Node node, int sum)
	{
		minSumFromRootToLeaf(node, 0);
		return minSum;
	}
	public Node getNewNode(int value) {
		Node n = new Node();
		n.data = value;
		n.left = null;
		n.right = null;
		return n;
	}

	public Node insert(int value, Node node) {
		if (node == null) {
			return getNewNode(value);
		} else {
			if (value < node.data) {
				node.left = insert(value, node.left);
			} else if (value > node.data) {
				node.right = insert(value, node.right);
			}
		}
		return node;
	}

	public static void main(String[] args) {

		Node root = null;
		Day4_Puzzle_03 p = new Day4_Puzzle_03();
		root = p.insert(2, root);
		root = p.insert(7, root);
		root = p.insert(5, root);
		root = p.insert(2, root);
		root = p.insert(6, root);
		root = p.insert(5, root);
		root = p.insert(11, root);
		root = p.insert(9, root);
		root = p.insert(4, root);
		
//		root = p.insert(10, root);
//		root = p.insert(5, root);
//		root = p.insert(5, root);
//		root = p.insert(2, root);
//		root = p.insert(1, root);
//		root = p.insert(-1, root);
		

		int minSumRootToLeaf = p.minimumSum(root, 0);
		System.out.println(minSumRootToLeaf);

	}

}
