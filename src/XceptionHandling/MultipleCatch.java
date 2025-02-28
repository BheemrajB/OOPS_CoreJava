package XceptionHandling;


public class MultipleCatch {
    public static void main(String[] args) {

        int i=20;
        int j=0;
//        int nums[]= new int[5];
//        String s = null;

        try {
            j = 18/i;
            if(j==0){
                throw new ArithmeticException("i dont want to print zero");
            }
//            System.out.println(s.length());
//            System.out.println(nums[1]);
//            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
//            System.out.println("cannot divide by zero");
            j=18/1;
            System.out.println("that the default value  " + e);
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Be in your limits");
//        }
        catch (Exception e){
            System.out.println("Something went wrong   "+ e);

        }
        System.out.println(j);
        System.out.println("Bye");
    }

}

