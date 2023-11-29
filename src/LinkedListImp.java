public class LinkedListImp<T> implements LinkedList<T> {
    Node<T> head;

    LinkedListImp() {
        head = null;
    }

    public void addFront(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addRear(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curNode = head;
            while(curNode.next != null) {
                 curNode = curNode.next;
            }
            curNode.next = newNode;
        }

        
    }

    public void display() {
        Node<T> cur = head;
        while (cur != null) {
            System.out.print(" " + cur.data);
            cur = cur.next;
        }
    }
}
