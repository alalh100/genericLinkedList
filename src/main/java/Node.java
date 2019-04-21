public class Node<T>{

    public  T element;
    public Node <T> next = null;

    public Node(T e, Node n) {
        this.element = e;
        this.next = n;
    }

    public Node(T e) {
        this.element = e;
    }
}
