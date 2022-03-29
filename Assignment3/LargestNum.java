import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int large=a>b?a:c;
        if(large==a)
        {
            large=a>c?a:c;
            System.out.print(large);
        }
        else
        {
            large=b>c?b:c;
            System.out.print(large);
        }
    }
}
