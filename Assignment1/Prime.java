import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the m value");
        int m=sc.nextInt();
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int c;
        for(int i=m+1;i<n;i++)
        {
            c=0;
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                {c=c+1;}
            }
            if(c==0)
                System.out.print(i+",");

        }
    }
}
