package collectionAPI;

import java.util.Hashtable;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map <String, Integer> students = new Hashtable<>();
        students.put("bheem", 45);
        students.put("munna", 95);
        students.put("kiran", 45);
        students.put("suraj", 75);
        students.put("mohan", 35);
        System.out.println(students.keySet());
////        System.out.println(students);
        for(String key : students.keySet() ){
            System.out.println(key +":"+ students.get(key));
        }

    }
}
