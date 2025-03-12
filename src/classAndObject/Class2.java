package classAndObject;

public class Class2 {
    int length, width;

    void setValues(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Class2 rect = new Class2();
        rect.setValues(10, 5);
        System.out.println("Area: " + rect.area());
    }
}
