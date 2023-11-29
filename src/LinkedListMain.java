public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        LinkedListImp<Integer> integerList = new LinkedListImp<>();
        // integerList.addFront(1);
        // integerList.addFront(2);
        // integerList.addFront(3);

        integerList.addRear(70);
        integerList.addRear(56);
        integerList.addRear(30);
        integerList.display();
    }
}
