import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String str1="";
        System.out.println("Enter the character to be removed");
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=ch)
            {
                str1=str1+str.charAt(i);
            }

        }
        System.out.println(str1);
    }
}
