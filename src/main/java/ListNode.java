public class ListNode<T extends Comparable<T> > {

    private Node<T> head = null;

    private ListNode( Node<T> head){

        this.head = head;
    }
/*
    private void insert( Node<T> newNode ){

            newNode.next = head;
            head = newNode;
    }
*/
    private void insert( Node<T> newNode ){

        Node<T> current = head;
        if (newNode.element.compareTo( current.element) <= 0 ){
            newNode.next = head;
            head = newNode;
        }else {

            while (newNode.element.compareTo(current.element) > 0 && current.next != null) {

                current = current.next;

            }
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    private void print(){
        Node<T> current = head;

        System.out.println("Liste :");
        while (current!=null) {
            System.out.println("   Element=" + current.element);
            current = current.next;
        }
        System.out.println("head ist "+ head.element);
    }

    public static void main(String[] args) {

        ListNode<Integer> root = new ListNode<>(new Node<> (5 ) );
        root.insert(new Node<> (6));
        root.insert(new Node<> (4));
        root.insert(new Node<> (3));
        root.insert(new Node<> (2));
        root.insert(new Node<> (7));
        root.insert(new Node<> (9));
        root.insert(new Node<> (12));
        root.insert(new Node<> (10));
        root.insert(new Node<> (1));
        root.print();
    }


}
