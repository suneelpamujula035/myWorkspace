package com.dsa.singlylinkedlist;

public class Linked2 {
    public Node insertAtPosition(int data, int position, Node node) {
        if (position < 0) {
            System.out.println("Position can't be less than 1");
        }
        if (node == null && position > 1) {
            System.out.println("Position is greater than element exists");
            return node;
        }
        if (node == null && position == 1) {
            return getNewNode(data);
        }
        if (position == 1) {
            Node newNode = getNewNode(data);
            newNode.next = node;
            return newNode;
        }
        node.next = insertAtPosition(data, position - 1, node.next);
        return node;
    }
    public Node insertFirst(int data, Node node)
    {
        Node a = getNewNode(data);
        a.next = node;
        return a;

    }
    public Node getNewNode(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = null;
        return n;
    }
    public Node insert(int value, Node node)
    {
        if(node==null)
        {
            return getNewNode(value);
        }
        else
        {
            node.next = insert(value, node.next);
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
            printList(node.next);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        Linked2 l = new Linked2();
        root = l.insert(12, root);
        root = l.insert(45, root);
        root = l.insert(98, root);
        root = l.insert(27, root);
        root = l.insertFirst(44, root);
        root = l.insertAtPosition(66,2,root);
        l.printList(root);
        System.out.println();

    }
}
