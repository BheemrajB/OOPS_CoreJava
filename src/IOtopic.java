

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
    private int id;
    transient  private String name;
    public Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
public class IOtopic {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee e1=new Employee(11,"Laxmi");
        System.out.println(e1);//Serilization

        FileOutputStream fos=new FileOutputStream("C:\\Users\\acer\\Desktop\\copyFrom\\source.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);
        oos.close();
        fos.close();
        System.out.println("Object Written");
        FileInputStream fis=new FileInputStream("C:\\Users\\acer\\Desktop\\copyFrom\\source.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee e2=(Employee)ois.readObject();
        System.out.println(e2);
    }
}