import java.util.Scanner;
public class Series5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int a=4,res;
        for(int i=1;i<=n;i++)
        {
            if(i==4)
            {
                continue;
            }
            res=i*i;
            System.out.print(res+",");
        }
    }
}
