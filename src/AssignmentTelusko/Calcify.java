package AssignmentTelusko;

import java.util.Scanner;

class ArithmeticOperations {
    int x, y;
    ArithmeticOperations(int x, int y) {
                this.x=x;
                this.y=y;
        }
    void add(){
        System.out.println(x+y);
    }
    void sub(){
        System.out.println(x-y);
    }
    void multi(){
        System.out.println(x*y);
    }
    void div(){
        System.out.println(x/y);
    }
}
public class Calcify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        ArithmeticOperations obj = new ArithmeticOperations(x,y);
        obj.add();
        obj.sub();
        obj.div();
        obj.multi();
    }
}

