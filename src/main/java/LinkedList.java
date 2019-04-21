public class LinkedList<T extends Comparable<T> > {

    public Node<T> head = null;

    public  LinkedList( Node<T> head){
        this.head = head;
    }


    public void insert( Node<T> newNode ){

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

    public void print(){
        Node<T> current = head;

        System.out.println("Liste :");
        while (current!=null) {
            System.out.println("   Element=" + current.element);
            current = current.next;
        }
    }


}
