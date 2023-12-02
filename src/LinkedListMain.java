public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        LinkedListImp<Integer> integerList = new LinkedListImp<>();
        integerList.addFront(70);
        integerList.addFront(56);
        integerList.addFront(30);

        integerList.addRear(70);
        integerList.addRear(56);
        integerList.addRear(30);

        integerList.insertElement(45, 0);

        integerList.deleteFirst();
        integerList.display();

        integerList.deleteLast();
        integerList.display();

        System.out.println(integerList.findElement(30));

        integerList.searchAndInsert(31, 75);

        integerList.display();

        integerList.deleteElement(30);

        integerList.display();

        OrderedList<Integer> orderedList = new OrderedList<>();
        orderedList.sortedAdd(56);
        orderedList.sortedAdd(30);
        orderedList.sortedAdd(40);
        orderedList.sortedAdd(70);

        orderedList.display();
    }
}
