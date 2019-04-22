public class ListNode<T extends Comparable<T> > {

    private Node<T> head = null;

    private ListNode( Node<T> head){
        this.head = head;
    }

    private void insert( Node<T> newNode ){

        Node<T> current = head;

        if ( newNode instanceof Comparable ){

            while ( newNode.element.compareTo( current.element) <= 0 && current != null  ){
                current = current.next;
            }
            newNode.next = current;

        }


    }

    private void print(){
        Node<T> current = head;

        System.out.println("Liste :");
        while (current!=null) {
            System.out.println("   Element=" + current.element);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        ListNode<Integer> root = new ListNode<>(new Node<> (5 ) );
        root.insert(new Node<> (6));
        root.insert(new Node<> (4));
        root.print();
    }


}
