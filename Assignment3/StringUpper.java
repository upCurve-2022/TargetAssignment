
import java.util.Scanner;
public class StringUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("After converting to upper case:");
        String str2=str.toUpperCase();
        String str3="";
        for(int i=0;i<str.length();i++)
        {
            char a=str.charAt(i);
            if(a!=' ') {
                char b = (char) (a - 32);
                str3 = str3 + b;
            }
            else
                str3=str3+" ";

        }
        System.out.println(str2);
        System.out.println(str3);
    }
}
