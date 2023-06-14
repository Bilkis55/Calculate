//Calculate area of triangle method -1
import java.util.*;
public class AreaTriangle {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the width of the Triangle :");
        double b=s.nextDouble();
        System.out.println("Enter the hieght of the Triangle :");
        double h=s.nextDouble();
        //area=(width*height)/2
        double area=(b*h)/2;
        System.out.println("Area of Triangle is : " +area);
        
    }
}
