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

    }
}
