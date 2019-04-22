public class ListNode<T extends Comparable<T> > {

    public Node<T> head = null;

    public ListNode( Node<T> head){
        this.head = head;
    }
    public void insert( Node<T> newNode ){

        newNode.next = head;
        head = newNode;
    }

    /*    public void insert( Node<T> newNode ){

            Node<T> current = head;
            while ( current != null){
                if ( newNode instanceof Comparable ){
                    Comparable <T> newNode2 = (Comparable) newNode;
                     while ( newNode2.compareTo((T) current) <= 0 ){
                         newNode.next = current.next;
                         current.next = newNode;

                         current = current.next;
                     }
                }

            }
        }
    */
    public void print(){
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
