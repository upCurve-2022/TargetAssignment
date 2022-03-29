
import java.util.Scanner;
public class Fibonacci {
    public void fibo(int n)
    {
        int count;
        int a=0,b=1,c;
        if(n<=1)
        System.out.print(a);
        else
        {
            System.out.print(a+" "+b+" ");
            count=2;
            while(count<n)
            {
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
                count++;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        Fibonacci obj=new Fibonacci();
        obj.fibo(n);

    }
}
