package com.dsa.binary_tree_search;

public class BinaryTree_01 {
    public Node getNewNode(int value)
    {
        Node n = new Node();
        n.data = value;
        n.left = null;
        n.right = null;
        return n;
    }
    public Node insert(int value, Node node) {
        if (node == null) {
            return getNewNode(value);
        } else
        {
            if (value < node.data)
            {
                node.left = insert(value, node.left);
            }
            else if (value > node.data)
            {
                node.right = insert(value, node.right);
            }
        }
        return node;
    }
    public void inOrder(Node node)//Sorting order(Ascending order)
    {
        if(node==null)
        {
            return ;
        }
        else
        {
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }
    public void preOrder(Node node)
    {
        if(node==null)
        {
            return ;
        }
        else
        {
            System.out.print(node.data+" ");
            inOrder(node.left);
            inOrder(node.right);
        }
    }
    public void postOrder(Node node)
    {
        if(node==null)
        {
            return ;
        }
        else
        {
            inOrder(node.left);
            inOrder(node.right);
            System.out.print(node.data+" ");
        }
    }

    public static void main(String[] args) {
        Node root = null;
        BinaryTree_01 t = new BinaryTree_01();
        root = t.insert(8, root);
        root = t.insert(2, root);
        root = t.insert(7, root);
        root = t.insert(17, root);
        root = t.insert(14, root);
        root = t.insert(6, root);
        root = t.insert(12, root);

        t.inOrder(root);
        System.out.println();
        t.preOrder(root);
        System.out.println();
        t.postOrder(root);
        System.out.println();

    }
}

