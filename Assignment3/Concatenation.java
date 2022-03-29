import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String str1=sc.nextLine();
        System.out.println("Enter the string2");
        String str2=sc.nextLine();
         str1=str1+str2;
        System.out.println("After concatenation:"+str1);
    }
}
