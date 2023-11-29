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
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    public void insertElement(T data, int pos) {
        if (pos == 0) {
            addFront(data);
            return;
        }

        Node<T> newNode = new Node(data);
        Node<T> curNode = head;

        for (int prev = 0; prev < pos - 1; prev++) {
            curNode = curNode.next;
        }

        newNode.next = curNode.next;
        curNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) 
            return;
        head = head.next;
    }

    public void display() {
        Node<T> cur = head;
        while (cur != null) {
            System.out.print(" " + cur.data);
            cur = cur.next;
        }
    }
}
