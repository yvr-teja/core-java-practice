import java.util.*;

class IteratorDemo1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list
            = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterator
        Iterator itr = list.iterator();

        System.out.println("Iterator:");
        System.out.println("Forward traversal: ");

        while (itr.hasNext())
            System.out.print(itr.next() + " ");

        System.out.println();

        // ListIterator
        ListIterator i = list.listIterator();

        System.out.println("ListIterator:");
        System.out.println("Forward Traversal : ");

        while (i.hasNext())
            System.out.print(i.next() + " ");

        System.out.println();

        System.out.println("Backward Traversal : ");

        while (i.hasPrevious())
            System.out.print(i.previous() + " ");

        System.out.println();
    }
}