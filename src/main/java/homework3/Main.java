package homework3;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Pear");
        list.add("Kiwi");
        list.add("Mandarin");
        list.add("Grapefruit");
        list.add("Mango");

        for (String fruit : list) {
            System.out.println(fruit);
        }

    }
}