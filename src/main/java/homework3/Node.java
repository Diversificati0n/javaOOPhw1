package homework3;

public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}
