package threadss;
class A extends Thread{
    public void run(){
        for (int i=1;i<10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("Helloooo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
//        System.out.println(obj1.getPriority());
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) { throw new RuntimeException(e);
        }
        obj1.start();
    }
}
