package linkedlist;

import java.util.Scanner;

public class TripletsFromThreeLinkedList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        LinkedListThree ll1 = takeInput(n);
        LinkedListThree ll2 = takeInput(n1);
        LinkedListThree ll3 = takeInput(n2);

        int target = sc.nextInt();

        int[] triplets = ll1.triplets(ll2, ll3, target);
        for (int i : triplets)
            System.out.print(i + " ");
    }

    public static LinkedListThree takeInput(int n) throws Exception {

        LinkedListThree ll = new LinkedListThree();

        for (int i = 0; i < n; i++)
            ll.addLast(sc.nextInt());

        return ll;
    }
}

class LinkedListThree {
    private static class Node {
        int data;
        Node next;
    }

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void display() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty.");

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {

        int count = 0;

        Node temp = head;

        while (temp != null) {
            count += 1;
            temp = temp.next;
        }

        return count;
    }

    public long getAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is empty.");
        if (index < 0 || index >= size()) throw new Exception("Invalid index " + index);

        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;

        return temp.data;
    }

    public Node getNodeAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is empty.");
        if (index < 0 || index >= size()) throw new Exception("Invalid index " + index);

        Node temp = head;

        for (int i = 1; i <= index; i++)
            temp = temp.next;

        return temp;
    }

    public void addLast(int item) throws Exception {

        Node nn = new Node();
        nn.data = item;

        if (isEmpty())
            head = nn;
        else {
            Node getNode = getNodeAt(size() - 1);
            getNode.next = nn;
        }
    }

    public int[] triplets(LinkedListThree two, LinkedListThree three, int target) {

        int[] triplet = new int[3];

        LinkedListThree.Node first = head;
        while (first != null) {

            LinkedListThree.Node second = two.head;
            while (second != null) {

                Node third = three.head;
                while (third != null) {
                    int sum = first.data + second.data + third.data;

                    if (sum == target) {
                        triplet[0] = first.data;
                        triplet[1] = second.data;
                        triplet[2] = third.data;
                        return triplet;
                    }

                    third = third.next;
                }

                second = second.next;
            }

            first = first.next;
        }

        return triplet;
    }
}
