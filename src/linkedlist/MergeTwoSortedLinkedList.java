package linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t > 0) {

            LinkedList list1 = new LinkedList();
            int n1 = scn.nextInt();

            for (int j = 0; j < n1; j++) {
                int item = scn.nextInt();
                list1.addLast(item);
            }

            LinkedList list2 = new LinkedList();
            int n2 = scn.nextInt();

            for (int j = 0; j < n2; j++) {
                int item = scn.nextInt();
                list2.addLast(item);
            }
            LinkedList ans = list1.merge_sorted_list(list2);
            ans.display();

            t--;
        }
    }
}

class LinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return head.data;
    }

    public int getLast() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return tail.data;
    }

    public int getAt(int index) throws Exception {
        if (this.size == 0) throw new Exception("linked list is empty");
        if (index < 0 || index >= size) throw new Exception("Invalid Index " + index);

        if (index == 0)
            return getFirst();
        else if (index == size - 1)
            return getLast();
        else {

            Node temp = head;
            for (int i = 1; i <= index; i++)
                temp = temp.next;

            return temp.data;
        }

    }

    private Node getNodeAt(int index) throws Exception {
        if (this.size == 0) throw new Exception("LL is empty");
        if (index < 0 || index >= size) throw new Exception("Invalid index " + index);

        Node temp = head;

        for (int i = 1; i <= index; i++)
            temp = temp.next;

        return temp;
    }

    public void addLast(int item) {
        // create a new node
        Node nn = new Node();

        nn.data = item;
        nn.next = null;

        // update summary
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            this.tail.next = nn;
            this.tail = nn;

            size++;
        }

    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            size++;
        }

    }

    public int removeFirst() throws Exception {
        Node fn = this.head;

        if (this.size == 0)
            throw new Exception("linked list is empty");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size = 0;
        } else {
            Node np1 = this.head.next;
            this.head = np1;
            size--;
        }

        return fn.data;
    }

    public LinkedList merge_sorted_list(LinkedList other) throws Exception {

        LinkedList ans = new LinkedList();

        Node temp = head;
        Node temp1 = other.head;

        while (temp != null && temp1 != null) {
            if (temp.data < temp1.data) {
                ans.addLast(temp.data);
                temp = temp.next;
            } else {
                ans.addLast(temp1.data);
                temp1 = temp1.next;
            }
        }

        while (temp != null) {
            ans.addLast(temp.data);
            temp = temp.next;
        }

        while (temp1 != null) {
            ans.addLast(temp1.data);
            temp1 = temp1.next;
        }

        return ans;
    }

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}

