package duckingXcepetion;
class CheckClass{
    public void show(){
        try {
            Class.forName("duckingXcepetion.DummyClass");
            Class.forName("Noobie");
            System.out.println("No issues, i found you");
        } catch (ClassNotFoundException e) {
            System.out.println("get the f*** out of my program  " + e);
        }
    }
}
public class DummyClass {
    static{
        System.out.println("Hello class!! hello!!! where are you?");
    }
    public static void main(String[] args) {

        CheckClass obj = new CheckClass();
        obj.show();
    }
}
