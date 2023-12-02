public class LinkedListImp<T extends Comparable> implements LinkedList<T> {
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

    public void deleteLast() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> prev = head;
        Node<T> cur = head.next;

        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }

        prev.next = null;
    }

    public int findElement(T data) {
        int pos = 0;
        Node<T> cur = head;

        while (cur != null) {
            if (cur.data.equals(data))
                return pos;
            pos++;
            cur = cur.next;
        }
        return -1;
    }

    public void searchAndInsert(T data1, T data2) {
        int pos = findElement(data1);
        if (pos == -1) {
            System.out.println("Invalid key");
            return;
        } else {
            insertElement(data2, pos + 1);
        }
    }

    public void deleteElement(T data) {
        int pos = findElement(data);
        Node<T> curNode = head;
        if (pos == -1) {
            System.out.println("data does not exist");
            return;
        } else if (pos == 0) {
            head = head.next;
        } else {
            for (int prev = 0; prev < pos - 1; prev++) {
                curNode = curNode.next;
            }
            curNode.next = curNode.next.next;
        }
    }

    public void display() {
        Node<T> cur = head;
        while (cur != null) {
            System.out.print(" " + cur.data);
            cur = cur.next;
        }
        System.out.println("");
    }
}
