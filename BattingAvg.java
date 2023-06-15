/*java program for calculating batting average through creating a seprate class
and taking input through scanner class
*/
import java.util.Scanner;
public class BattingAvg {
    double avg=0;
    BattingAvg(long r,long i, long n)
    {
        if(i==n)
        {
            avg=r;
        }
    
    else
      {
        avg=r/(i-n);
       }
    } 
}
class Batavg
{
    public static void main(String[]args)
    {
        long Matches,runs,innings,notout;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of matches played");
        Matches=sc.nextLong();
        while(true)
        {
            System.out.println("Enter the number innings batted");
            innings=sc.nextLong();
            if(innings<=Matches)
                break;
            System.out.println("Enter the number inningsbatted correctly<=matches");
        }
        while(true)
        {
            System.out.println("Enter the number of times notout");
            notout=sc.nextLong();
            if(notout<=innings)
                break;
            System.out.println("Enter the number times became notout correctly <=innings");
        }
        System.out.println("Enter runs scored");
        runs=sc.nextLong();
        BattingAvg a=new BattingAvg(runs,innings,notout);
        System.out.println("Batting average=" +a.avg);
        
    }
}
