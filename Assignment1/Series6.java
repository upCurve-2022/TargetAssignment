import java.util.Scanner;
public class Series6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int res=1;
        System.out.print(res+",");
        for(int i=0;i<n+2;i++)
        {  if(i%3==0)
        {
            continue;
        }
            res=res+(4*i);
            System.out.print(res+",");

        }
    }
}
