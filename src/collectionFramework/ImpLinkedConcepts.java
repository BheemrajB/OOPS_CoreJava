package collectionFramework;

import java.util.LinkedList;

public class ImpLinkedConcepts {
//duplicate
//insertion order
//hetoroginius
//null
//DubllyLinked -adding/element best
//worst retrival RandomAccess
    public class TestLinkedList {

        public static void main(String[] args) {

            LinkedList list=new LinkedList<>();
            list.add("Sunil");
            list.add("Sunil");
            list.add("Anil");
            list.add("Arun");
            list.add(12);
            list.addFirst("Kabuter");
            list.addLast("K");
            System.out.println(list);

        }

    }
}
