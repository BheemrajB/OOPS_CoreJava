package ClassAndObject;

public class Class1 {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Class1 car1 = new Class1();
        car1.brand = "Toyota";
        car1.speed = 120;
        car1.display();
    }
}