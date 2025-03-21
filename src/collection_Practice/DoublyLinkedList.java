package collection_Practice;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public DoublyLinkedList() {
        this.size = 0;
    }
    private static class Node {
        private final int value;
        private Node next;
        private Node prev;

        private Node(int value) {
            this.value = value;
        }
        private Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    //-----------------------------------------------------------------------------------
    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    //-----------------------------------------------------------------------------------
    public void addLast(int val){
        Node node= new Node(val);
        Node last=head;
        node.next=null;
        if (head==null){
            head.prev=null;
            head=node;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        size++;
    }
//    public void addLast(int val) {
//        Node node = new Node(val);
//        node.next = null;
//
//        if (head == null) {
//            node.prev = null;
//            head = node;
//            tail = node;
//        } else {
//            tail.next = node;
//            node.prev = tail;
//            tail = node;
//        }
//
//        size++;  
//    }

    //-----------------------------------------------------------------------------------

    public void displayNode(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.print("null");
    }
    //-----------------------------------------------------------------------------------

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(11);
        list.addFirst(15);
        list.addFirst(19);
        list.addFirst(25);
        list.addLast(99);
        list.displayNode();
    }
}