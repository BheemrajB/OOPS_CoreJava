package duckingXcepetion;


class A {
    public void display() throws ClassNotFoundException {

        Class.forName("duckingXcepetion.DummyClass");
        Class.forName("Biscuit");
    }
}

public class UsingThrowsKey {
    static{
        System.out.println("Hello class!! hello!!! where are you?");
    }
    public static void main(String[] args) {

        A obj1 = new A();
        try {
            obj1.display();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
