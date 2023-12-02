public class OrderedList<T extends Comparable> {
    Node<T> head;

    OrderedList() {
        head = null;
    }

    public void sortedAdd(T data) {
        Node<T> newNode = new Node<>(data);

        // if list is empty or to insert at begining
        if (head == null || head.data.compareTo(data) >= 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> prev = head;
        Node<T> cur = head.next;

        while (cur != null && cur.data.compareTo(data) < 0) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = newNode;
        newNode.next = cur;
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
