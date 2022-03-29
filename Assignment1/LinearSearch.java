import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,c=0;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the key element");
        int key=sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(key==a[i])

            { c=c+1;
                break;}

        }if(c==1)
        System.out.println(key +"is present in the array at"+(i)+"position");
        else
            System.out.println(key +"is not present in the array");
    }
}
