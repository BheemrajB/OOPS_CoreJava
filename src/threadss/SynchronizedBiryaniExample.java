package threadss;

    class FoodItem
    {
        synchronized void eatBiryani(String type) throws InterruptedException
        {
            for(int i=1;i<10;i++)
            {
                System.out.println("Eat "+type);
                Thread.sleep(2000);
            }
        }
    }

    class Dog extends Thread
    {
        FoodItem f;
        String type;
        Dog(FoodItem f,String type)
        {
            this.f=f;
            this.type=type;
        }

        public void run()
        {
            try {
                f.eatBiryani(type);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }


public class SynchronizedBiryaniExample {
        public static void main(String[] args) {

            FoodItem f1=new FoodItem();
            FoodItem f2=new FoodItem();
            Dog sonu=new Dog(f1,"VEG");
            Dog monu=new Dog(f2,"NonVEG");
            sonu.start();
            monu.start();



        }

    }

