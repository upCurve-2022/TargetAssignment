import java.util.Scanner;

public class UglyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int[] a=new int[n];
        int i=0,c=0,count=0;
            for(int j=1;j<=n;j++)
            {
                if(n%j==0)
                {
                    a[i]=j;
                    i++;
                }
            }
            for(i=0;i<a.length;i++)
            {
                c=0;
                for(int j=1;j<=a[i];j++)
                {
                    if(a[i]%j==0)
                        c=c+1;
                }
                if(c==2) {

                    if (a[i] == 2 || a[i] == 3 || a[i] == 5) {
                        count = count + 1;

                    } else
                        count = 0;
                }
            }
            if(count>0&&count<=3)
                System.out.println(n+" is a ugly number");
            else
                System.out.println(n+" is not an ugly number");



    }
}
