package Threadss;
class Q {
    int count;
    public void incremented(){
//    public synchronized void incremented(){
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
       Q object1= new Q();
        Runnable j = () ->{
            for (int b=0;b<10000;b++){
                object1.incremented();
            }
        };
        Runnable j1=() ->{
            for (int i = 0; i <10000 ; i++) {
                object1.incremented();
            }
        };
        Thread a1= new Thread(j);
        Thread a2 = new Thread(j1);
        a1.start();
//        a1.join();
        a2.start();
//        a2.join();

//        a1.join();
//        a2.join();
        System.out.println(object1.count);

    }
}
