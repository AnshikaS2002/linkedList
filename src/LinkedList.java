public interface LinkedList<T> {
    void addFront(T data);

    void addRear(T data);

    void insertElement(T data, int pos);

    void deleteFirst();

    void deleteLast();

    int findElement(T data);

    void searchAndInsert(T data1, T data2);

    void display();
}
