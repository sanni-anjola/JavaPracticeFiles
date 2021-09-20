package africa.semicolon.python;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
    @Test
    void DoublyLinkedListCanBeDisplayed(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.displayList();
    }

    @Test
    void DoublyLinkedListCanAddItem(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(2);
        list.add(6);
        list.add(9);
        list.displayList();
        System.out.println(list.size());
        System.out.println(list.peekFirst());
        list.insertAtBeginning(1);
        list.displayList();
        System.out.println(list.size());
        System.out.println(list.peekFirst());


    }

}