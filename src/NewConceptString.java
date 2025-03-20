public class NewConceptString
{
    public static void main(String[] args) {
//        String s1= new String("Anuj");
//        String s2 = new String("Anuj");
//        String s3 = "Anuj";
//        String s4 ="Anuj";
//        System.out.println(s1==s2); //objects are created and compared
//        System.out.println(s1.equals(s2)); //equals method is overridden in string class(as it compares the content of the string)
//        System.out.println(s3==s4); //objects are created and compared
//        System.out.println(s3.equals(s4)); //equals method is overridden in string class(as it compares the content of the string)
        //Find total objects are created in the memory

                String s1 = new String("Spring");
                System.out.println("s1 HashCode (Heap): " + System.identityHashCode(s1));

                s1.concat("Summer");

                String s2 = s1.concat("Winter");
                System.out.println("s2 HashCode (Heap): " + System.identityHashCode(s2));

                s1 = s1.concat("faLL");
                System.out.println("s1 HashCode (Heap after concat): " + System.identityHashCode(s1));


                String s3 = "Spring";
                System.out.println("s3 HashCode (SCP): " + System.identityHashCode(s3));

                System.out.println("s1 == s2 ? " + (s1 == s2));
                System.out.println("s1 == s3 ? " + (s1 == s3));


            }
        }










