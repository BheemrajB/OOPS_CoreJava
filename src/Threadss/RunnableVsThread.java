package Threadss;

public class RunnableVsThread {
    public static void main(String[] args) {
        Runnable obj1 = () ->{
          for (int i=1; i<100;i++){
              System.out.println("hi");
              try{
                  Thread.sleep(10);
              } catch(Exception e){System.out.println("default value" + e);}
          }
        };
        Runnable obj2 =() ->{
            for (int i=1;i<100;i++){
                System.out.println("hello");
                try{
                    Thread.sleep(10);
                } catch(Exception e){System.out.println("default value" + e );

                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
