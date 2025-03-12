package collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;String name;

    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';

    }
}

public class Comparable1 {
    public static void main(String[] args) {
//        Comparator<Integer> com = new Comparator<Integer>()
//        {
//            public int compare(Integer i, Integer j) {
//
//                if (i%10>j%10)
//                    return 1;
//                else
//                    return -1;
//
//                }
//
//        };
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        //        List<Integer> nums = new ArrayList<Integer>();
//        nums.add(41);
//        nums.add(65);
//        nums.add(78);
//        nums.add(72);
//        nums.add(53);
//
//        Collections.sort(nums,com);
//        System.out.println(nums);
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(12, "kartik"));
        studs.add(new Student(22, "monu"));
        studs.add(new Student(16, "sonu"));
        studs.add(new Student(13, "bhargav"));
//        System.out.println(studs);
        Collections.sort(studs);
        for (Student s : studs) {
            System.out.println(s);
        }


    }
}