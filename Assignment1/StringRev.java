import java.util.Scanner;
public class StringRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        int l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

    }
}
