package com.company.demo;

class Node{
    Node next;
    int data;
}

public class Linked {
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while (n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public  void show()
    {
        Node node = head;
        while (node.next!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        Linked list = new Linked();
        list.insert(23);
        list.insert(87);
        list.insert(12);
        list.insert(27);
        list.insert(65);
        list.show();
    }
}
