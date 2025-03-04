package CollectionAPI;

import java.awt.*;
import java.util.*;
import java.util.List;

//public class ArrayListss {
//    public static void main(String[] args) {
//        Collection nums = new ArrayList();
//        nums.add(6);
//        nums.add(8);
//        nums.add(9);
//        nums.add(2);
//        System.out.println(nums);
//    }
//}
public class ArrayListss {
    public static void main(String[] args) {
//        Collection <Integer> nums = new ArrayList<Integer>();
//        List<Integer> nums = new ArrayList<Integer>();
//        Set<Integer> nums = new TreeSet<Integer>();
        Collection<Integer>nums=new TreeSet<Integer>();
        nums.add(2);
        nums.add(34);
        nums.add(25);
        nums.add(27);
        Iterator<Integer> values=nums.iterator();
        while (values.hasNext()){
            System.out.println(values.next());
        }}}
//        nums.add("78");
//        System.out.println(nums);
//        System.out.println(nums.indexOf(34));
//        System.out.println(nums.get(2));

//        for(int n :nums){
////            int num=(Integer)n;
//            System.out.println(n);
//        }
//    }
//}

