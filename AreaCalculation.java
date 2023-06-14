
//Area Calculation using inheritance 
import java.util.Scanner;
public class AreaCalculation {
    double area;
    void circle(double r)
    {
        area=(22*r*r)/7;
    }
}
class AreaCircle extends AreaCalculation
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double rad=s.nextDouble();
        AreaCircle a=new AreaCircle();
        a.circle(rad);
        System.out.println("Area of Circle : " +a.area);
    }
}

    
    

