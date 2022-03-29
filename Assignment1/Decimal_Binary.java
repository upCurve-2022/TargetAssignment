import java.util.Scanner;
public class Decimal_Binary {
    public void convert(int n)
    {
        int[] a=new int[30];
        int i=0;
        while(n>0)
        {
            a[i]=n%2;
            n=n/2;
            i++;
        }
        for(i=i-1;i>=0;i--)
            System.out.print(a[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number");
        int num=sc.nextInt();
        Decimal_Binary obj=new Decimal_Binary();
        System.out.println("Decimal to Binary");
        obj.convert(num);
    }
}

