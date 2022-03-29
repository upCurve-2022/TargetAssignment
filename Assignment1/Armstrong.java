import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number value");
        int n=sc.nextInt();
        int m=n,dig,res=0;
        while(m!=0)
        {
            dig=m%10;
            res=res+(dig*dig*dig);
            m=m/10;
        }
        if(n==res)
        {
            System.out.println(n +" is a Armstrong number");
        }
    }
}
