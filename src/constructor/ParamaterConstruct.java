package constructor;

class Person {
    String name;

    Person(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person p = new Person("Alice");
        p.display();
    }
}