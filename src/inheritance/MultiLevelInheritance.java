package inheritance;

class Vehicle {
    void move() {
        System.out.println("Vehicles can move.");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car speed is 100km/hr.");
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("SportsCar has turbo.");
    }

    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.move();
        sc.speed();
        sc.turbo();
        System.out.println();
        Car sc1 = new Car();
        sc1.speed();
        sc1.move();
        System.out.println();
        Vehicle sc2 = new Vehicle();
        sc2.move();
    }
}
