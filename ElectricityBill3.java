/*Calculate electricity bill Using Inheritance
 */
import java.util.*;
public class ElectricityBill3
{
    double billpay;
    void Bill(long units)
    {
        if(units<100)
            billpay=units*1.20;
        else if (units<=300)
            billpay=100*1.20+(units-100)*2;
        else if(units>300)
            billpay=100*1.20+200*2+(units-300)*3;
        
    }
    
        
            
    }
class CalculateBill extends ElectricityBill3
{
    public static void main(String[]args)
    {
        long units;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of units ");
        units=sc.nextLong();
        ElectricityBill3 bill=new ElectricityBill3();
        bill.Bill(units);
        System.out.println("Bill to pay :" +bill.billpay);
        
    }
}
    

