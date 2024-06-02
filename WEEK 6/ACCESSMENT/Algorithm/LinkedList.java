
import java.util.*;

class Program {
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
        LinkedList prev = null;
        LinkedList current = head;

        while (current != null) {
            LinkedList nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}