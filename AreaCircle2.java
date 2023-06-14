//Calculate Area of circle using the Interface 
import java.util.*;
interface AreaCircle2
{
void circle();    
}
class Area3 implements AreaCircle2 
{
    double area;
    public void circle(double r)
    {
        area=(22*r*r)/7;
    }
    public static void main(String[]args)
    {
        Area3 x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius : ");
        double rad=s.nextDouble();
        x=new Area3();
        x.circle(rad);
        System.out.println("Area of circle is :"+ x.area);
    }

    @Override
    public void circle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
