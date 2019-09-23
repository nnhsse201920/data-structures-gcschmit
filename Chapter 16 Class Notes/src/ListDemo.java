/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        // create a linked list and add names to it
        LinkedList staff = new LinkedList();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Diana");

        ListIterator iterator = staff.listIterator();       // |DHRT
        iterator.next();                                    // D|HRT
        iterator.next();                                    // DH|RT

        // add more elements after the second element
        iterator.add("Juliet");                             // DHJ|RT
        iterator.add("Nina");                               // DHJN|RT

        // remove Romeo
        iterator.next();                                    // DHJNR|T
        iterator.remove();                                  // DHJN|T

        // print all elements
        iterator = staff.listIterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
