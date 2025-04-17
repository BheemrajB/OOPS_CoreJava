import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class MethodReference {
    public static void main(String[] args) {
//        List<String> names= Arrays.asList("naveen", "bheem", "ajay");
//        List<String>uNames=names.stream()
//                .map(String::toUpperCase)
//                .toList();
//        uNames.forEach(System.out::println);
        String names1[]={"naveen", "bheem", "ajay"};
        Arrays.stream(names1).filter(e->e.length()>4).forEach(System.out::println);
    }
}
