package AssignmentTelusko;


import javax.xml.namespace.QName;

class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.name= name;
        this.price=price;
        this.quantity=quantity;
    }
    public Product(String name){
        this.name=name;
        this.price=price;
        this.quantity=5;
    }
    public Product(String name, double price){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public Product(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String toString(){
        return ("name : "+ name + "\nprice : "+ price +"\nquantity : " + quantity);
    }

}

public class ProductDetails {
    public static void main(String[] args) {
        Product p1=new Product("TCL");
        Product p2=new Product();
        Product p3=new Product("MRF", 1000);
        Product p4=new Product("raj",12.9, 12);
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);
        System.out.println();
        System.out.println(p4);

    }
}
