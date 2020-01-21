package com.demigod.tutorial.impQs;

public class RevLinkList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node current = node;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String... args) {
        RevLinkList list = new RevLinkList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        System.out.println("Before");
        print(head);
        head = list.reverse(head);
        System.out.println("\nAfter");
        print(head);
    }
}

