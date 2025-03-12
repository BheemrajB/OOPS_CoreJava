package collectionFramework;

import java.util.ArrayList;

public class UsingStringGenerics {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("honey");
        names.add("Milk");
        names.add("powder");
        names.add("Sugar");
        System.out.println("names = " + names.get(0).toUpperCase());

    }
}
