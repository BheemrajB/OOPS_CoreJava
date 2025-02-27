package DataAbstraction;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle.");
    }

    public static void main(String[] args) {
        Shape s = new Shape() {
            @Override
            void draw() {
                System.out.println("ShockAyyava");
            }
        };
        s.draw();

        Shape s1 = new Circle();
        s1.draw();
    }
}