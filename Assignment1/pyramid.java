import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int j,i,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=0;i<n;i++)
        {
            for(j=n-i;j>1;j--)
                System.out.print(" ");
            for(k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
