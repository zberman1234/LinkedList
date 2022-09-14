public class LinkedList {

    Element head;

    /**
     * Finds the element with the specified key value
     * @param key the key of the Element to be found
     * @return the Element with the given key
     */
    public Element search(int key) {

        Element x = head;

        while(x!=null && x.getKey() != key) {
            x = x.getNext();
        }

        return x;
    }

    /**
     * Inserts a new Element at the head of the list
     * @param e the Element to be inserted
     */
    public void insert(Element e) {
        // Stack behavior
        e.setNext(head);
        if(head != null) {
            head.setPrev(e);
        }
        head = e;
        e.setPrev(null);

        // Queue behavior (I think)
        // if(head == null) head = e;
        // else {
        //     head.setNext(e);
        //     e.setPrev(head);
        //     e.setNext(null);
        // }
        

    }

    /**
     * Deletes a given Element from the list
     * @param x the Element to be deleted
     */
    public void delete(Element x) {
        if(x.getPrev() != null) {
            x.getPrev().setNext(x.getNext());
        } else {
            head = x.getNext();
        }
        if(x.getNext() != null) {
            x.getNext().setPrev(x.getPrev());
        }

    }

}
