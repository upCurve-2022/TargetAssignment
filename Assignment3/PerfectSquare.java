import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(n==i*i)
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println(n+" is a perfect square");
        else
            System.out.println(n+" is not a perfect square");
    }
}

