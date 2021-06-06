package linkedlist.methods;

public class LinkedList {
    private class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int item) {
            this.data = item;
        }
    }

    private Node head;

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public int size() {

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count += 1;
            temp = temp.next;
        }

        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) throw new Exception("LL is Empty");

        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) throw new Exception("LL is Empty");

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        return temp.data;
    }

    public int getAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is Empty");
        if (index < 0 || index > size() - 1) throw new Exception("Invalid Index");

        if (index == 0) return getFirst();
        else if (index == size() - 1) return getLast();

        Node temp = head;

        for (int i = 1; i <= index; i++)
            temp = temp.next;

        return temp.data;
    }

    private Node getNodeAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is Empty");
        if (index < 0 || index > size() - 1) throw new Exception("Invalid Index");

        Node temp = head;

        for (int i = 1; i <= index; i++)
            temp = temp.next;

        return temp;
    }

    public void addLast(int item) throws Exception {

        Node newNode = new Node();
        newNode.data = item;

        if (isEmpty()) {
            head = newNode;
        } else {
            Node lastNode = getNodeAt(size() - 1);
            lastNode.next = newNode;
        }

    }

    public void addFirst(int item) {

        Node newNode = new Node();
        newNode.data = item;

        newNode.next = head;
        head = newNode;
    }

    public void addAt(int index, int item) throws Exception {
        if (index < 0 || index > size()) throw new Exception("Invalid index");

        if (index == 0) addFirst(item);
        else if (index == size()) addLast(item);
        else {
            Node newNode = new Node();
            newNode.data = item;

            Node beforeNode = getNodeAt(index - 1);
            Node afterNode = getNodeAt(index);

            beforeNode.next = newNode;
            newNode.next = afterNode;
        }
    }

    public int removeLast() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        int lv = getLast();

        if (size() == 1)
            head = null;
        else {
            Node newLastNode = getNodeAt(size() - 2);
            newLastNode.next = null;
        }

        return lv;
    }

    public int removeFirst() throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");

        int fv = getFirst();

        if (size() == 1)
            head = null;
        else {
            head = head.next;
        }

        return fv;
    }

    public int removeAt(int index) throws Exception {
        if (isEmpty()) throw new Exception("LL is empty");
        if (index < 0 || index >= size()) throw new Exception("Invalid index");

        int rv = getAt(index);

        if (index == 0)
            return removeFirst();
        if (index == size() - 1)
            return removeLast();
        else {
            Node beforeNode = getNodeAt(index - 1);
            Node currentNode = getNodeAt(index);

            beforeNode.next = currentNode.next;
            currentNode.next = null;
        }

        return rv;
    }

    public void reverse() {

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

    public void reverseRR() {
//        reverseRR(null, head);
//        reverseRRDeep(null, head);

        Node temp = head;
        reverseRR(head);
        temp.next = null;
    }

    private void reverseRR(Node prev, Node curr) {

        if (curr == null) {
            head = prev;
            return;
        }

        reverseRR(curr, curr.next);
        curr.next = prev;

    }

    private void reverseRRDeep(Node prev, Node curr) {

        if (curr == null) {
            head = prev;
            return;
        }

        Node ahead = curr.next;
        curr.next = prev;
        reverseRRDeep(curr, ahead);

    }

    private void reverseRR(Node curr) {

        if (curr.next == null) {
            head = curr;
            return;
        }

        reverseRR(curr.next);
        curr.next.next = curr;

    }

    public int KthFromLast(int k) {

        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= k; i++)
            fast = fast.next;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public void removeKthFromEnd(int k) {

        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= k; i++)
            fast = fast.next;

        if (fast == null) {
            head = head.next;
            return;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
    }

    public int midPoint() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public int interSectionPoint(Node head1, Node head2) {

        Node temp1 = head1;

        while (temp1 != null) {

            Node temp2 = head2;

            while (temp2 != null) {

                if (temp1 == temp2) {
                    return temp1.data;
                }

                temp2 = temp2.next;
            }

            temp1 = temp1.next;

        }

        return -1;
    }

    public int intersectionPoint(Node h1, Node h2) {

        Node fp = head;
        Node sp = h2;

        while (fp != sp) {

            if (fp == null) {
                fp = h2;
            } else fp = fp.next;

            if (sp == null) {
                sp = h1;
            } else sp = sp.next;

        }

        return fp.data;
    }

    public void linkedListKAppend(int n) throws Exception {

        int rotate = n % size();

        for (int i = 1; i <= rotate; i++) {

            Node lb = getNodeAt(size() - 2);

            Node temp = lb.next;
            temp.next = head;
            head = temp;
            lb.next = null;
        }

    }

    public void kReverse(int k) {
        head = kReverse(head, k);
    }

    private Node kReverse(Node root, int k) {

        if (root == null) {
            return null;
        }

        Node temp = root;
        for (int i = 1; i <= k && temp != null; i++)
            temp = temp.next;

        Node prev = kReverse(temp, k);
        Node curr = root;

        while (curr != temp) {

            Node ahead = curr.next;
            curr.next = prev;

            prev = curr;
            curr = ahead;
        }

        return prev;
    }
}
