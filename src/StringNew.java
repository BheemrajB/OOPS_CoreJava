public class StringNew {

    //charAt,indexOff,lastIndefOf,concat,length

        public static void main(String[] args) {

//charAt,indexOff,lastIndefOf,concat,length
                    String s=new String("Anuj");
                    //charAt
                    System.out.println(s.charAt(2));///u

//System.out.println
//                    (s.charAt(20));//StrngIndexoutOfBound
                    //IndexOf
                    String s1="ababab";
                    System.out.println(s1.indexOf('b'));//1
                    System.out.println(s1.lastIndexOf('b'));//5

                    String s2=new String("Anuj");
                    s2.concat("Sharma"); //
                    System.out.println(s2);

                    //	s2=s2.concat("Sharma");
                    //	System.out.println(s2); //AnujSharma
//		s2=s2+"sharma";
//		System.out.println(s2);//AnujSharma
                    s2+="Sharma";
                    System.out.println(s2);//AnujSharma
                    System.out.println(s2.length());

                    String s3="Anuj";
                    System.out.println(s3.toUpperCase());
                    System.out.println(s3.toLowerCase());

                    String s5="ababa";
                    System.out.println(s5.replace('b', 'a'));

                    String s6="abcdefg";
                    System.out.println(s6.substring(2));//cdefg
                    System.out.println(s6.substring(2,6));//cdef

                    String s7=" Anuj ";
                    System.out.println(s7);
                    System.out.println(s7.trim());
                    String s8=" Anuj Sharma ";
                    System.out.println(s8.trim());
                    String username="Anuj";
                    System.out.println(username.equalsIgnoreCase("anuj"));
                    String password="Anuj@1234";
                    System.out.println(password.equals("anuj@1234"));

                }

            }
