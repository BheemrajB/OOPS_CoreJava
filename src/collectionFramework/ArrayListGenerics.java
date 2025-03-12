package collectionFramework;

import java.util.ArrayList;

public class ArrayListGenerics {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();

        list.add("Rohan");
        list.add("bheem");
        list.add("raj");
        list.add("king");

//        list.add(10);
        String names=(String)list.get(0);
        System.out.println("names = " + names.toUpperCase());
//        int names1= Integer.parseInt((String) list.get(1));
//        System.out.println("names1 = " + names1);
    }
}