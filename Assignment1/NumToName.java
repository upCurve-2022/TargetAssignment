import java.util.Scanner;
public class NumToName {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int dig,rev=0;
   System.out.print("Enter a number");
    int n=sc.nextInt();
    int m=n;
    while(m!=0)
    {
        dig=m%10;
        rev=rev*10+dig;
        m=m/10;
    }
        while(rev!=0)
        {
            dig=rev%10;
        switch(dig)
        {
            case 0:System.out.print("Zero ");
                   break;
            case 1:System.out.print("One ");
                   break;
            case 2:System.out.print("Two ");
                break;
            case 3:System.out.print("Three ");
                break;
            case 4:System.out.print("Four ");
                break;
            case 5:System.out.print("Five ");
                break;
            case 6:System.out.print("Six ");
                break;
            case 7:System.out.print("Seven ");
                 break;
            case 8:System.out.print("Eight ");
                break;
            case 9:System.out.print("Nine ");
                break;
        }
        rev=rev/10;
    }
}}
