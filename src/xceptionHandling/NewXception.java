package xceptionHandling;
class NewException extends Exception{
     String string;
     public NewException(String string)
    {
        this.string=string;
    }
//        super(string);
//    }
}
public class NewXception {
    public static void main(String[] args) {
        String s;

        try {
           s=null;
            if(s==null){
                throw new NewException("Null");

            }
            if(s.length()==0){
                throw new Exception("write a string");
            }
        }
        catch (NewException e) {
            System.out.println("Lazy fellow "+ e);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }

        System.out.println("Done");
    }
}

