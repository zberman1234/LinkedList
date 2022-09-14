public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int pass=0;
        int fail=0;

        Element fe = new Element(3);
        if(testConstructor()) pass++;
        else fail++;
        if(testSetter()) pass++;
        else fail++;
        if(testSearch()) pass++;
        else fail++;
        if(testSearchne()) pass++;
        else fail++;
        if(testSearchte()) pass++;
        else fail++;
        if(testDelete1()) pass++;
        else fail++;
        if(testDelete2()) pass++;
        else fail++;

        LinkedList fl = new LinkedList();

        fl.search(3); 


        System.out.println("Passes: " + pass + "Fails: " + fail);
    }

    /**
     * Tests deleting the first added element
     * @return Whether or not the element was actually deleted
     */
    private static boolean testDelete2() {
        LinkedList fl = new LinkedList();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);
        fl.delete(fe);
        return fl.search(3) == null;
    }

    /**
     * Tests deleting the second added element
     * @return If the element was actually deleted
     */
    private static boolean testDelete1() {
        LinkedList fl = new LinkedList();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);
        fl.delete(se);
        return fl.search(3) == fe;
    }

    /**
     * Tests search with size one list
     * @return Whether search has found the right element
     */
    public static boolean testSearchne() {
        LinkedList fl = new LinkedList();
        Element fe = new Element(3);
        fl.insert(fe);

        return fl.search(3) == fe;
    }

    /**
     * Tests search with size two list
     * @return Whether search finds the right element
     */
    public static boolean testSearchte() {
        LinkedList fl = new LinkedList();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);

        return fl.search(3) == fe;
    }

    /**
     * Test search with empty list
     * @return Whether list is actually empty
     */
    public static boolean testSearch() {
        LinkedList fl = new LinkedList();

        return fl.search(3) == null;
    }

    
    /**
     * Tests setNext Element class method
     * @return Whether next Element has been set 
     * and to the correct value
     */
    public static boolean testSetter() {
        Element fe = new Element(3);
        Element s = new Element(4);
        fe.setNext(s);
        return fe.getNext().getKey() == 4;
    }
    /**
     * Tests Element constructor
     * @return whether constructor has created Element 
     * and assigned it the correct key value
     */
    public static boolean testConstructor() {
        Element fe = new Element(3);
        return fe.getKey() == 3;
    }
}
