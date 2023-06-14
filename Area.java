//Calculate Area of Calculation Using constructor
import java.util.Scanner;
class Areacircle
{
    double area;
    Areacircle(double r)
    {
        area=(22*r*r)/7;
    }
    
    
}
class Area
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double rad=s.nextDouble();
        Areacircle a=new Areacircle(rad);
        System.out.println("Area of circle is : " + a.area);
    }
}
