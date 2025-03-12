package collectionAPI;

import java.util.ArrayList;

public class Generics11 {
    public static void main(String[] args) {
        String names[]= new String[5];
        names[0]="bheem";
        names[1]="rohan";
        names[2]="king";
        names[3]="mohan";
        names[4]="jeevan";
        //names[5]=10;
//        ArrayList list = new ArrayList();
//        list.add("mohan");
//        list.add("jeevan");
//        list.add("rohan");
//        list.add(10);
        ArrayList<String> list = new ArrayList<>();
        list.add("mohan");
        list.add("jeevan");
        list.add("rohan");
//        list.add(10);
//        String name= (String)list.get(0);
//        int name1= (Integer)list.get(3);
//        System.out.println(name.toUpperCase());
//        System.out.println(name1);
        String name1= list.get(0);
        System.out.println(name1.toUpperCase());


    }
}
