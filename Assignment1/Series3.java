import java.util.Scanner;
public class Series3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int res;
        for(int i=1;i<=n;i++)
        {
            res=(int)Math.pow(i,i);
            System.out.print(res +"," );
        }
    }
}
