import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        String str2="";
        int l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            str2=str2+str.charAt(i);
        }
        if(str2.equalsIgnoreCase(str))
        {
            System.out.println(str+" is a palindrome");
        }
        else
            System.out.println(str+ "is not a palindrome");
    }
}
