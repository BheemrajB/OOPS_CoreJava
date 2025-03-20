package threadss;

    class Table
    {
        synchronized void showTable(int n)
        {
            for(int i=1;i<=10;i++)
            {   try {
                Thread.sleep(2000);
                System.out.println(n+"x"+i+"="+n*i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            }
        }
    }

    class Thread21 extends Thread
    {
        Table t;
        int n;

        public Thread21(Table t, int n) {

            this.t = t;
            this.n = n;
        }

        public void run()
        {
            t.showTable(n);
        }
    }


public class SynchronizedThreads {
        public static void main(String[] args) {

            Table t=new Table();
            Thread21 t21=new Thread21(t,5);
            Thread21 t22=new Thread21(t,15);
            t21.start();
            t22.start();


        }
    }
