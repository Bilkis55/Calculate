//Calculate of triangle using Constructor
import java.util.Scanner;
public class AreaofTriangle {
    long area;
    AreaofTriangle(long b,long h)
    {
        area=(b*h)/2;
    }
}
class AOT
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the width of Triangle : ");
        long b=s.nextLong();
        System.out.println("Enter the Height of the Triangle ; ");
        long h=s.nextLong();
        AreaofTriangle A=new AreaofTriangle(b,h);
        System.out.println("Area of the Triangle is : " + A.area);
    }
}