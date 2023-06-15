/*Calculate Discount Using Standard Values Consider this program is universal code.*/
public class Discount {
    public static void main(String[]args)
    {
        double dis,amount,marketprice,s;
        marketprice=1000;
        dis=25;//25% of discount
        System.out.println("marketprice=" + marketprice);
        System.out.println("Discount rate=" +dis);
        s=100-dis;
        amount= (s*marketprice)/100;
        System.out.println("amount after discount=" + amount);
    }
    
}
