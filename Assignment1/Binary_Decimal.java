import java.util.Scanner;
public class Binary_Decimal {
    public int convert(long n)
    {
        int dig=0,i=0;
        long rem;
        while(n!=0)
        {
            rem=n%10;
            dig=dig+(int)(rem*Math.pow(2,i));
            n=n/10;
            i++;
        }
        return dig;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary string");
        long num=sc.nextLong();
        Binary_Decimal obj=new Binary_Decimal();
        int decimal=obj.convert(num);
        System.out.println("Binary to decimal");
        System.out.println(num +" "+decimal);
    }
}
