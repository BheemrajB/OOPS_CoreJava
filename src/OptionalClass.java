import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names1= Arrays.asList("Kiran","pranav","sonu");
//        String names2=names1.stream()
//                .filter(str->str.contains("x"))
//                .findFirst().
//                orElse("not found");
       Optional <String> names2=names1.stream()
                .filter(str->str.contains("v"))
                .findFirst();
        System.out.println(names2.get());

//        System.out.println(names2.orElse("not found"));


    }
}
