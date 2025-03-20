package threadss;

    class Thread41 extends Thread
    {
        public void run()
        {
            System.out.println(Thread.currentThread().getName()+"="+Thread.currentThread().getPriority());
        }

    }


public class Priority_In_Thread {

        public static void main(String[] args) {

            System.out.println(Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(17);
            System.out.println(Thread.currentThread().getName()+"="+Thread.currentThread().getPriority());
            Thread41 t=new Thread41();
            t.start();


        }

    }

