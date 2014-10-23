import java.util.Iterator;
import java.util.ListIterator;

/**
 * LinkedListDriver.java
 *
 * Created by Calvin Wong on 10/20/14.
 *
 * A tester that would create an instance of this LinkedList and add "Tom", "Kate", "Harry", "Sam" and then:
 *
 * Insert Bill before Tom
 * Insert Sue after Sam
 * Remove Kate
 * Remove Sam
 *
 * The tester will print the list after all initial 4 are added and after each of these operations. And use this
 * class's iterator to do so.
 *
 */
public class LinkedListDriver {

    public static void main(String[] args) {

        KWLinkedList<String> name = new KWLinkedList<String>();

        name.add("Tom");
        name.add("Kate");
        name.add("Harry");
        name.add("Sam");

        ListIterator itr = name.listIterator();

        while(itr.hasNext()) {
            System.out.print(itr.next() + " --> "); // prints out using iterator
        }

        name.addFirst("Bill"); // adds Bill before Tom

        ListIterator itr2 = name.listIterator();

        System.out.println();

        while(itr2.hasNext()) {
            System.out.print(itr2.next() + " --> "); // prints out using iterator
        }

        name.addLast("Sue"); // adds Sue after Sam

        ListIterator itr3 = name.listIterator();

        System.out.println();

        while(itr3.hasNext()) {
            System.out.print(itr3.next() + " --> "); // prints out using iterator
        }

        name.remove(2);

        ListIterator itr4 = name.listIterator();

        System.out.println();

        while(itr4.hasNext()) {
            System.out.print(itr4.next() + " --> "); // prints out using iterator
        }

        name.remove(2);

        ListIterator itr5 = name.listIterator();

        System.out.println();

        while(itr5.hasNext()) {
            System.out.print(itr5.next() + " --> "); // prints out using iterator
        }
    }
} // end of class
