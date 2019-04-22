public class Node<T>{

    public  T element = null;
    public Node <T> next = null;

    public Node(T e, Node<T> n) {
        this.element = e;
        this.next = n;
    }

    public Node(T e) {

        this.element = e;
    }
}
