public class StringConcepts {
    public static void main(String[] args) {
                String s=new String();
                System.out.println(s.length());

                String s1=new String("Anuj");
                System.out.println(s1.length());

                StringBuffer sb=new StringBuffer("AnujS");
                String s3=new String(sb);
                System.out.println(s3.length());

                char[] c= {'a','b','c','d','e'};
                String s4=new String(c);
                System.out.println(s4);

                byte[] b= {101,102,103,104};
                String s5=new String(b);
                System.out.println(s5);
    }}
