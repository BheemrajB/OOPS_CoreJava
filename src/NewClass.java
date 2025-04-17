
interface Sum{
    void add();
}

class Operations{

    void sumAdd(){
        int c; int a=4; int b=5;
        c=a+b;
        System.out.println("Sum is : "+ c);
    }
}

public class NewClass {
    public static void main(String[] args) {
        Operations opt = new Operations();
        Sum sumOp= opt::sumAdd;
        sumOp.add();

    }
}
