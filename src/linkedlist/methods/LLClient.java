package linkedlist.methods;

public class LLClient {
    public static void main(String[] args) throws Exception {

        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addLast(80);
        ll.addLast(90);
        ll.addLast(100);

//        ll.display();
//        ll.reverse();
//        System.out.println(ll.midPoint());
//        ll.reverseRR();
//        ll.display();

//        System.out.println(ll.interSectionPoint(ll.head, ll.head2));
//        ll.linkedListKAppend(1);

        ll.display();
        ll.kReverse(3);
        ll.display();

    }
}
