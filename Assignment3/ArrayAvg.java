import java.util.Scanner;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the  elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int sum=0;
        float avg;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=(float)sum/n;
        System.out.println("Average is:"+avg);
    }
}
