package XceptionHandling;



class BheemException extends Exception{
    public BheemException(String string)
    {
        super(string);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i =20;
        int j=0;

        try {
            j=18/i;
            if(j==0){
                throw new BheemException("This is my message");
            }
        }
        catch (BheemException e) {
            j = 18/1;
            System.out.println("thats the default output  "+ e);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}

