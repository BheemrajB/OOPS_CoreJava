package ThisAndSuper;

class Parent {
    void show() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    void show() {
        super.show();
        System.out.println("Child class method.");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}