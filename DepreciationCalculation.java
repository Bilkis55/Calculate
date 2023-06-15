//Depreciation Calculation and taking inputs through Scanner class
import java.util.Scanner;
public class DepreciationCalculation {
    long amount,deppercent,year,afterdep,temp;
    DepreciationCalculation(long amount,long deppercent,long year)
    {
        afterdep=amount;
        for(int i=0;i<year;i++)
            afterdep=((100-deppercent)*afterdep)/100;
    }
            
    
}
class Depreciation
{
    public static void main(String[]args)
    {
        long amount,deppercent,year,afterdep,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount : ");
        amount=sc.nextLong();
        System.out.println("Enter Depreciation percentage :");
        deppercent=sc.nextLong();
        System.out.println("Enter the number of years");
        year=sc.nextLong();
        DepreciationCalculation d=new DepreciationCalculation(amount,deppercent,year);
        System.out.println("After depreciation =" + d.afterdep);
    }
}
