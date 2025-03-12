class Rectangle
{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}
class Cuboid1 extends Rectangle
{
    int height = 9;
    Cuboid1(int length, int breadth) {
        super(length, breadth);

    }

    int	volume=length*breadth*height;

    void display()
    {
        System.out.println("volume of cuboid is " +volume);
    }





}
public class VolumeCuboid {
    public static void main(String []args)
    {
        Cuboid1 c=new Cuboid1(4,6);
        c.display();

    }
}