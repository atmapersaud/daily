import atmanode.Node;

// singly linked version
// will take o(n) to insert at the end
// will take o(n) to delete at the end
import Node;

public class LinkyList<T> {
    Node<T> head;
    int listSize;

    void addFirst(T item) {
        //create node
        Node<T> newHead = new Node();
        
        //put it in the correct position
        //increment size
        listSize++;
    }

    void addLast(T item) {
        listSize++;
    }

    T removeFirst() {
        T first = head;
        head = head.next;
        listSize--;
        return first;
    }

    T removeLast() {
        listSize--;
        return last;
    }

    int size() {
        return listSize();
    }
}

