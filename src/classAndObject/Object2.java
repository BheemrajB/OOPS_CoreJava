package classAndObject;

public class Object2 {
        String name;
        int age;

        void setDetails(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Object2 s1 = new Object2();
            Object2 s2 = new Object2();
            s1.setDetails("John", 20);
            s2.setDetails("Emma", 22);
            s1.display();
            s2.display();
        }
    }
