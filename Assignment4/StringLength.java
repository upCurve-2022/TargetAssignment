import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=sc.nextLine();
        char[] str=str1.toCharArray();

        int l = 0;
        for (char c:str) {
            l = l + 1;
        }
        System.out.println("Length of the string " + str1 + "is:" + l);
    }
}
