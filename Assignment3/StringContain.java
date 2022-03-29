import java.util.Scanner;

public class StringContain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String str1=sc.nextLine();
        System.out.println("Enter the string2");
        String str2=sc.nextLine();
       if(str1.contains(str2))
       {
           System.out.println(str2+"is present at "+str1.indexOf(str2)+" position in the string");
        }
       else
           System.out.println(str2+"is not present in the string");
    }
}
