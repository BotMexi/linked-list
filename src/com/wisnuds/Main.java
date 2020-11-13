package com.wisnuds;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(1);
        Node node3 = new Node(65);
        Node node4 = new Node(3);
        Node node5 = new Node(10);
        Node node6 = new Node(9);
        Node node7 = new Node(12);
        Node node8 = new Node(5);

        Node node9 = new Node(8);
        Node node10 = new Node(6);
        Node node11 = new Node(1);
        Node node12 = new Node(5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);

        node9.setNext(node10);
        node10.setNext(node11);
        node11.setNext(node12);

        ManipulateLinkedList linkedList = new ManipulateLinkedList();
        System.out.println("Jumlah node         : "+linkedList.countLinkedList(node1));
        System.out.println("Total Number node   : "+linkedList.sumLinkedList(node1));
        linkedList.printAllNodes(linkedList.mergeLinkedList(node1,node9));
        linkedList.splitLinkedList(node1, 8);
        linkedList.printAllNodes(linkedList.sortLinkedList(node1));
        linkedList.printAllNodes(linkedList.reverseLinkedList(node1));
    }
}
