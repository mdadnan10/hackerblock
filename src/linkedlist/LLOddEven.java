package linkedlist;

import java.util.*;

public class LLOddEven {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedListOddEven ll = new LinkedListOddEven();
        int n = scn.nextInt();

        for (int j = 0; j < n; j++) {
            int item = scn.nextInt();
            ll.addLast(item);
        }

        ll.partition();
        ll.display();

    }
}

class LinkedListOddEven {

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

    public void partition() throws Exception {
        Node oddHead = null;
        Node evenHead = null;
        Node odd = null;
        Node even = null;

        Node temp = head;
        while (temp != null) {

            if (temp.data % 2 == 0) {

                if (evenHead == null) {
                    evenHead = temp;
                    even = temp;
                } else {
                    even.next = temp;
                    even = even.next;
                }

            } else {
                if (oddHead == null) {
                    oddHead = temp;
                    odd = temp;
                } else {
                    odd.next = temp;
                    odd = odd.next;
                }
            }

            temp = temp.next;
        }
        if (odd != null) odd.next = evenHead;
        if (even != null) even.next = null;
        if (oddHead != null) head = oddHead;
        else head = evenHead;
    }

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
