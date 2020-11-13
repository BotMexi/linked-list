package com.wisnuds;

public class ManipulateLinkedList {
    public int countLinkedList(Node node){
        int count = 0;
        Node current = node;
        while (current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    public int sumLinkedList(Node node){
        int sum = 0;
        Node current = node;
        while (current != null){
            sum += current.getNumber();
            current = current.getNext();
        }
        return sum;
    }

    public Node mergeLinkedList(Node start, Node end){
        Node current = start;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(end);
        return start;
    }

    public void splitLinkedList(Node node, int position){
        if (position > countLinkedList(node) || position < 0){
            System.out.println("Kelebihan Om");
        }else {
            int count = 0;
            Node current = node;
            Node split = null;
            while (current != null){
                count++;
                if (count == position){
                    split = current.getNext();
                    current.setNext(null);
                    break;
                }
                current = current.getNext();
            }
            printAllNodes(node);
            System.out.println();
            printAllNodes(split);
        }
    }

    public void printAllNodes(Node node){
        Node current = node;
        while(current != null){
            System.out.print(current.getNumber()+" ");
            current = current.getNext();
        }
        System.out.println();
    }

    public Node sortLinkedList(Node node){
        int count = countLinkedList(node);
        int[] nodes = new int[count];
        Node current = node;
        int i = 0;
        while(current != null){
            nodes[i] = current.getNumber();
            current = current.getNext();
            i++;
        }
        nodes = sort(nodes);
        Node newNode = new Node(0);
        Node currentNewNode = newNode;
        for (int item : nodes){
            Node newItem = new Node(item);
            currentNewNode.setNext(newItem);
            currentNewNode = newItem;
        }
        return newNode.getNext();
    }

    public int[] sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public Node reverseLinkedList(Node node){
        int count = countLinkedList(node);
        Node[] nodes = new Node[count];
        Node current = node;
        int i = 0;
        while(current != null){
            nodes[i] = current;
            current = current.getNext();
            nodes[i].setNext(null);
            i++;
        }
        for (int j = count-2; j >=0; j--) {
            nodes[j+1].setNext(nodes[j]);
        }
        return nodes[count-1];
    }

}
