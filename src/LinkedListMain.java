public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        Node node1 = new Node(56);
        Node node2 = new Node(30);
        Node node3 = new Node(70);
        node1.next = node2;
        node2.next = node3;

        System.out.println("list is " + node1.data + " " + node2.data + " " + node3.data);
    }
}
