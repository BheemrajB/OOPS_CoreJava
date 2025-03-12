package encapsulation;

public class Employee {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("David");
        System.out.println("Employee Name: " + emp.getName());
    }
}
