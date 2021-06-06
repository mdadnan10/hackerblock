package linkedlist;

import java.util.List;
import java.util.Scanner;

public class AddTwoLinkedList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int n = sc.nextInt();
        int n1 = sc.nextInt();

        LinkedListAdd list1 = takeInput(n);
        list1.reverse();

        LinkedListAdd list2 = takeInput(n1);
        list2.reverse();

        LinkedListAdd ans = list2.addTwoLinkedList(list1);
        ans.display();

    }

    public static LinkedListAdd takeInput(int n) throws Exception {

        LinkedListAdd ll = new LinkedListAdd();

        for (int i = 0; i < n; i++)
            ll.addLast(sc.nextInt());

        return ll;
    }
}

class LinkedListAdd {
    public class Node {
        int data;
        Node next;
    }

    private Node head;

    public void display() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public int size() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        return temp.data;
    }

    public int getAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        if (index < 0 || index >= size()) throw new Exception("Invalid index " + index);

        Node temp = head;

        for (int i = 1; i <= index; i++)
            temp = temp.next;

        return temp.data;
    }

    private Node getNodeAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");
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
            Node temp = getNodeAt(size() - 1);
            temp.next = nn;
        }
    }

    public void addFirst(int item) {

        Node nn = new Node();
        nn.data = item;

        nn.next = head;
        head = nn;
    }

    public void addAt(int item, int index) throws Exception {
        if (index < 0 || index > size()) throw new Exception("invalid index " + index);

        if (index == 0)
            addFirst(item);
        else if (index == size())
            addLast(item);
        else {

            Node nn = new Node();
            nn.data = item;

            Node prev = getNodeAt(index - 1);
            Node next = getNodeAt(index);

            prev.next = nn;
            nn.next = next;
        }

    }

    public int removeLast() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        int last = getLast();

        if (size() == 1) {
            head = null;
        } else {
            Node removeLast = getNodeAt(size() - 2);
            removeLast.next = null;
        }

        return last;
    }

    public int removeFirst() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        int firstValue = getFirst();

        if (size() == 1)
            head = null;
        else {
            head = head.next;
        }

        return firstValue;
    }

    public int removeAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        int rv = getAt(index);

        if (index == 0)
            removeFirst();
        else if (index == size() - 1)
            removeLast();
        else {
            Node prev = getNodeAt(index - 1);
            prev.next = getNodeAt(index + 1);
        }

        return rv;
    }

    public void reverse() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node ahead = curr.next;
            curr.next = prev;

            prev = curr;
            curr = ahead;
        }

        head = prev;
    }

    public LinkedListAdd addTwoLinkedList(LinkedListAdd other) throws Exception {

        LinkedListAdd ans = new LinkedListAdd();

        Node temp = this.head;
        Node temp1 = other.head;

        int carry = 0;

        while (temp != null || temp1 != null) {

            int sum = carry;

            if (temp != null) {
                sum += temp.data;
                temp = temp.next;
            }

            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }

            int rem = sum % 10;
            ans.addFirst(rem);

            carry = sum / 10;
        }

        if (carry > 0)
            ans.addFirst(carry);

        return ans;
    }

}

