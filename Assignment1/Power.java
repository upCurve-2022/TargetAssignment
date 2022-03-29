import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        System.out.println("Enter the m value");
        int m=sc.nextInt();
        int product=1;
        for(int i=1;i<=m;i++)
        {
            product=product*n;
        }
        System.out.println(n+"to the power of"+m+"is:"+product);
    }
}
