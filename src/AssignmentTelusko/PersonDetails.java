package AssignmentTelusko;

class Person{
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id){
        this.name=name;
        setAge(age);
        setId(id);
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>0)
            this.age=age;
        else
            System.out.println("enter a positive valid age");
    }
    public void setId(String id){
        if(!id.isEmpty())
            this.id=id;
        else
            System.out.println("Enter a valid age again");
    }
    public void setName(String name){
        this.name=name;
    }
    public void displayContents(){
        System.out.println("Name of a person : " + name);
        System.out.println("age of a person : "+ age);
        System.out.println("id : "+ id);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Person p1 = new Person("RAGHAV", 14, "bokka123");
        System.out.println("Initial details");
        p1.displayContents();
        System.out.println();
        p1.setName("ajay");
        p1.setId("qwuuuqd12");
        p1.setAge(30);
        System.out.println("updated details are");
        p1.displayContents();


    }
}
