package classAndObject;

public class Object1 {
    String name;

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Object1 p1 = new Object1();
        p1.name = "Alice";
        p1.display();
    }
}
