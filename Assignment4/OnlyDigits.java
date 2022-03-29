import java.util.Scanner;

public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the String");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                count=count+1;
            }
        }
        if(count==str.length())
            System.out.println(str+" contains only digits");
        else
            System.out.println(str+" does not contain only digits ");
    }
}
