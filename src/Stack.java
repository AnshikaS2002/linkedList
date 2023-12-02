public class Stack<T> {
    LinkedListImp<T> linkedListImp = new LinkedListImp<T>();

    public void push(T data) {
        linkedListImp.addRear(data);
    }

    public void pop() {
        linkedListImp.deleteLast();
    }

    public void display() {
        linkedListImp.display();
    }
}
