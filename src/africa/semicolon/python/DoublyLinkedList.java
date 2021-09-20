package africa.semicolon.python;

public class DoublyLinkedList {

    private static class Node {
        private Node prev;
        private Node next;
        private final Integer value;

        public Node(Integer value) {
            this.value = value;
        }
    }
    private Node start;
    private int count = 0;


    public void displayList(){
        if(start == null) return;
        var current = start;
        while (current != null){
            System.out.printf("%d ", current.value);
            current = current.next;
        }
        System.out.println();
    }

    public int size(){
        return count;
    }

    public void add(Integer value){
        Node node = new Node(value);
        if(start == null) {
            start = node;
        }else {
            Node current = start;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
            node.prev = current;
        }
        count++;
    }

    public void insertAtBeginning(Integer value){
        var node = new Node(value);
        if(start == null) start = node;
        else {
            node.next = start;
            start.prev = node;
            start = node;
        }
        count++;
    }

    public Integer peekFirst(){
        if(start != null) return start.value;
        return null;
    }



}


//class Node{
//    private Node prev;
//    private Node next;
//    private Integer value;
//
//
//    public Node(Node prev, Node next, Integer value) {
//        this.prev = prev;
//        this.next = next;
//        this.value = value;
//    }
//
//    public Node(Integer value){
//        this(null, null, value);
//    }
//
//    public Node getPrev() {
//        return prev;
//    }
//
//    public void setPrev(Node prev) {
//        this.prev = prev;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//
//    public Integer getValue() {
//        return value;
//    }
//
//    public void setValue(Integer value) {
//        this.value = value;
//    }
//}