public class ImpTopicString {
    public static void main(String[] args) {
     String s1= new String("Anuj");
        String s2= new String("Anuj");
        System.out.println(s1==s2);//objects are created and compared
        System.out.println(s1.equals(s2));//equals method is overridden in string class(as it compares the content of the string)


        StringBuffer sb= new StringBuffer("Anuj");
        StringBuffer sb1= new StringBuffer("Anuj");
        System.out.println(sb==sb1);//objects are created and compared
        System.out.println(sb.equals(sb1));//equals method is not overridden in string buffer class(as it compares the reference of the string buffer)
    }
}