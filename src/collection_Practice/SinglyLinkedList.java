package collection_Practice;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkedList(){
        this.size=0;
    }
    private static class Node{
        private final int value;
        private Node Next;

        public Node(int value, Node next) {
            this.value = value;
            Next = next;
        }
        public Node(int value) {
            this.value = value;
        }
    }
    //   ------------------------------------------------------------------------------------
    public void addFirst(int value){
        Node node= new Node(value);
        node.Next=head;
        head=node;
        if (tail==null){
            tail=node;
        }
        size++;
    }
    //    ------------------------------------------------------------------------------------

    public void add(int value,int index){
        if(index==0){
            addFirst(value);
            return;
        }
        if (index==size){
            addLast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.Next;
        }
        Node node = new Node(value, temp.Next);
        temp.Next=node;
        size++;
    }
    //    ------------------------------------------------------------------------------------

    public void addLast(int val){
        if(tail==null){
            addFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.Next=node;
        tail=node;
        size++;
    }
    //    ------------------------------------------------------------------------------------

    public void displayNode(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.Next;
        }
        System.out.println("null");
    }
    //    ------------------------------------------------------------------------------------
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.Next;
        if (head==null){
            tail=null;
        }
        size--;
    }
    //    ------------------------------------------------------------------------------------
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.Next;
        }
        return node;
    }
    //    ------------------------------------------------------------------------------------
    public void deleteLast() {
        if (size == 0) {
            System.out.println("The list is empty");
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node secondLast = get(size - 2);
        secondLast.Next = null;
        tail = secondLast;
        size--;
    }

    //    ------------------------------------------------------------------------------------
    public void delete(int index){
        if (index==0){
            deleteFirst();
            return;
        }
        if (index==size-1){
            deleteLast();
            return;
        }
        Node prev=get(index-1);
        Node toDelete = prev.Next;
        prev.Next = toDelete.Next;

        size--;

    }
    //    ------------------------------------------------------------------------------------






    public static void main(String[] args) {
        SinglyLinkedList list= new SinglyLinkedList();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(9);
        list.addFirst(10);
        list.addFirst(18);
        list.addLast(99);
        System.out.println("List without any changes");
        list.displayNode();
        System.out.println("Adding New value according to index");
        list.add(100,2);
        list.displayNode();
        System.out.println("Deleting first node");
        list.deleteFirst();
        list.displayNode();
        System.out.println("Deleting last node");
        list.deleteLast();
        list.displayNode();
        System.out.println("Displays after deleting according to index");
        list.delete(3);
        list.displayNode();
    }
}
