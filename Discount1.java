//Calculate Discount Taking inputs through Scanner class 
import java.util.Scanner;
public class Discount1 {
    public static void main(String[]args)
    {
        double dis,amount,marketprice,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marketprice :");
        marketprice=sc.nextDouble();
        System.out.println("Enter the discount :");
        dis=sc.nextDouble();
        s=100-dis;
        amount=(s*marketprice)/100;
        System.out.println("Amount after discount is :" + amount);
    }
    
}
