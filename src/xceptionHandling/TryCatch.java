package xceptionHandling;


public class TryCatch {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            j=18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong  " + e.getMessage());
            e.printStackTrace();
//            e.printStackTrace(System.out);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}

