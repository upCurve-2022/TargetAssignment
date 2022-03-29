import java.util.Scanner;

public class Largest {

    public void max(int[] a)
    {
        int large=0;
        int nextmax=0;
        for(int i=0;i<3;i++)
        {
            if(a[i]>=large) {
                nextmax = large;
                large = a[i];
            }
            else if(nextmax<a[i])
                nextmax=a[i];


        }
        System.out.println("Largest is :"+large);
        System.out.print("Second Largest is :"+nextmax);
    }
        public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        int[]  arr=new int[3];
        System.out.println("Enter the 3 numbers");
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        Largest obj=new Largest();
        obj.max(arr);
    }
}
