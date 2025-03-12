package collectionFramework;

import java.util.ArrayList;

class Teacher {
    private int id;
    private String name;

    Teacher(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

   class Student
   {
        private int id1;
        private String name1;
        Student(int id1, String name1)
        {
            super();
            this.id1= id1;
            this.name1=name1;
        }

       @Override
       public String toString() {
           return "Student{" +
                   "id1=" + id1 +
                   ", name1='" + name1 + '\'' +
                   '}';
       }
   }

public class TypeSafety {
    public static void main(String[] args) {

        Student std= new Student(1,"Bheem");
        Student std1= new Student(2,"Rohan");

        Teacher emp = new Teacher(1,"Maria");

        ArrayList<Student> list= new ArrayList<>();
        list.add(std);
        list.add(std1);
//        list.add(emp);
        System.out.println("list = " + std1);
    }
}
