package AssignmentTelusko;

import java.security.spec.RSAOtherPrimeInfo;

class Car
{
    private int year;
    private String make;
    private String model;
    void setCarDetails(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("CAR DETAILS ARE:- MODEL ="+ model );
        System.out.println("MAKE ="+ make);
        System.out.println("year ="+ year);
        System.out.println("<------------------------------>");
    }
}
public class NewCars{
    public static void main(String[] args) {
        Car obj1= new Car();
        obj1.setCarDetails("Toyota","Camry", 2019);
        Car obj2= new Car();
        obj2.setCarDetails("Honda","City", 2011);
        obj1.displayDetails();
        obj2.displayDetails();
    }

}