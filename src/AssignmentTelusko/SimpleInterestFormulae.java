package AssignmentTelusko;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class SimpleMethod{
    Scanner sc = new Scanner(System.in);
    int principleAmount,tenure,rate;
    SimpleMethod() {
        System.out.println("enter principle amount");
        this.principleAmount = sc.nextInt();
        System.out.println("enter the tenure");
        this.tenure = sc.nextInt();
        System.out.println("enter the rate of interest");
        this.rate = sc.nextInt();
    }
    void formula(){
        int simpleInterest= ((principleAmount*tenure*rate)/100);
        System.out.println("simpleInterest for the above data is : "+ simpleInterest);
    }
}
public class SimpleInterestFormulae {
    public static void main(String[] args) {
        SimpleMethod m1= new SimpleMethod();
        m1.formula();
    }

}
