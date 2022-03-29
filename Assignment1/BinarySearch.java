import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,mid,first=0,last=n-1;
        System.out.println("Enter the array elements in an order");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the key element");
        int key=sc.nextInt();
        while(first<=last) {
            mid = (first+last)/ 2;
            if (a[mid] == key) {
                System.out.println(key + "is present in the array at " + mid + "position");
                break;
            }
            else if (key < a[mid]) {
               last=mid-1;}
               else
                   first=mid+1;
            }
        if(first>last)
          System.out.println(key+"is not present in the array");
        }
    }

