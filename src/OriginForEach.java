import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OriginForEach {
    public static void main(String[] args) {
       List<Integer>nums= Arrays.asList(2,23,3,4,5,55);
        System.out.println(nums);
//        Consumer<Integer>con= n->System.out.println(n);


//        nums.forEach(n->System.out.print("\t"+n));
    }
}