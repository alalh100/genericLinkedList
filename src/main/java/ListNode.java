public class ListNode<T extends Comparable<T> > {

    private Node<T> head = null;

    private ListNode( Node<T> head){

        this.head = head;
    }

    private void insert( Node<T> newNode ){

        Node<T> current = head;                            // to go through the list
        Node<T> preCurrent = null;                         // to know the Node before current

        //add at the beginning of the list
        if (newNode.element.compareTo( current.element) <= 0 ){
            newNode.next = head;
            head = newNode;
        }else {
            // this while loop is used to put "current" at the right place to add the new element
            while (newNode.element.compareTo(current.element) > 0 && current.next != null) {
                preCurrent = current;
                current = current.next;
            }
            // add at the end of the list
            if(newNode.element.compareTo(current.element) > 0 && current.next == null){
                current.next = newNode;
            }
            // add the element at a specific place
            else {
                newNode.next = preCurrent.next;
                preCurrent.next = newNode;
            }
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
        root.insert(new Node<> (8));
        root.print();
    }


}
