//Calculate area of triangle usin User-Defined Method
import java.util.Scanner;
public class AreaTriangle1 {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the width of triangle :");
        double b=s.nextDouble();
        System.out.println("Enter the Height of the Triangle :");
        double h=s.nextDouble();
        double area=AOT(b,h);
        System.out.println("Area of Triangle is :" +area);
        
    }
    static double AOT(double b,double h)
    {
        return((b*h)/2);
        
    }
}
