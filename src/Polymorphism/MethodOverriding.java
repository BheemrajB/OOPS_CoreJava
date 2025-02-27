package Polymorphism;

class Parent {
    void show() {
        System.out.println("Parent's show method.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's show method.");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}