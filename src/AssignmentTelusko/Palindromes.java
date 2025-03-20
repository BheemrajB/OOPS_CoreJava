package AssignmentTelusko;


import java.lang.reflect.Array;
import java.util.Arrays;
//        String name = "madam";
//        int count = 0;
//        String[] names = new String[5];
//        names[0] = "m";
//        names[1] = "a";
//        names[2] = "d";
//        names[3] = "a";
//        names[4] = "m";
//        for (String i : names) {
//            System.out.println(i);
//       }
////        String[] naming=names.clone();
//            String[] naming1 = Arrays.copyOf(names, names.length);
//            for (int b = 4; b >= 0; b--) {
//                if (naming1[b].equals( names[4 - b])) {
//                    count = count + 1;
//                }
//            }
//            System.out.println(count);
//            System.out.println(names.length);
//            if (count == names.length) {
//                System.out.println("it is a palindrome");
//            } else
//                System.out.println("not a palindrome");
//
//        }
//    }
       public class Palindromes{
            public static boolean isPalindrome(String str) {

                str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                int left = 0;
                int right = str.length() - 1;


                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        return false;
                    }
                    left++;
                    right--;
                }

                return true;
            }

            public static void main(String[] args) {

                String sentence1 = "A man, a plan@, a canal, Panama";
                String sentence2 = "Madam";
                String sentence3 = "Hello, World!";


                System.out.println("Is the sentence \"" + sentence1 + "\" a palindrome? " + isPalindrome(sentence1));
                System.out.println("Is the word \"" + sentence2 + "\" a palindrome? " + isPalindrome(sentence2));
                System.out.println("Is the sentence \"" + sentence3 + "\" a palindrome? " + isPalindrome(sentence3));
            }
}