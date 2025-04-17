import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Studentss{
    private String name;
    private int age;
    public Studentss(){

    }
    public Studentss(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studentss{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String>names10= Arrays.asList("King","Queen","Minister");
        List<Studentss>stud=new ArrayList<>();
//        for (String name:names10){
//            stud.add(new Studentss(name));
//        }


//        stud=names10.stream()
//                .map(name->new Studentss(name))
//                .toList();
//        System.out.println(stud);


        stud=names10.stream()
                .map(Studentss::new)
                .toList();
        System.out.println(stud);
    }
}
