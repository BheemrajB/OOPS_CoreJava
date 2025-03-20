package collectionAPI;

public class ImpTopicStringBuffer {


        public static void main(String[] args) {


            StringBuffer sb=new StringBuffer();

            System.out.println(sb.length());
            System.out.println(sb.capacity());
            sb.append("abcdefghijklmnop");
            System.out.println(sb.length());
            System.out.println(sb.capacity());
            sb.append("q");
            System.out.println(sb.length());
            System.out.println(sb.capacity());//(cc+1)x2 =34
            sb.append("abcdefghijklmnop");
            sb.append("q");
            sb.append("r");
            System.out.println(sb.length());//35
            System.out.println(sb.capacity());//34+1x2=70
            String s=new String();
            System.out.println(s.length());
        }

    }

