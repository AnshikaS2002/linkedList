public class Queue<T> {
    LinkedListImp<T> linkedListImp = new LinkedListImp<T>();

    public void enqueue(T data) {
        linkedListImp.addRear(data);
    }

    public void dequeue() {
        linkedListImp.deleteFirst();
    }

    public void display() {
        linkedListImp.display();
    }
}
