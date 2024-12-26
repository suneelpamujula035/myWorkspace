package com.dsa.singlylinkedlist;

public class Linked1 {
    public Node getNewNode(int data)
    {
        Node n = new Node();
        n.data = data;
        n.next = null;
        return n;
    }
    public Node insert(int data,Node node)
    {
        if (node==null)
        {
            return getNewNode(data);
        }
        else
        {
            node.next = insert(data,node.next);
        }
        return node;
    }
    public void printList(Node node)
    {
        if (node==null)
        {
            return;
        }
        else
        {
            System.out.print(node.data+" ");
        }
        printList(node.next);
    }
    public static void main(String[] args) {
        Node root = null;
        Linked1 l = new Linked1();
        root = l.insert(12, root);
        root = l.insert(45, root);
        root = l.insert(98, root);
        root = l.insert(27, root);
        root = l.insert(42, root);
        root = l.insert(64, root);
        l.printList(root);
        System.out.println();


    }
}
