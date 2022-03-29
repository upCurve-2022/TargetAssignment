import java.util.Scanner;

public class StringEmpty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        if(str.length()==0)
        {
            System.out.println("Given string is empty");

        }
        else
            System.out.println(str+" is not an empty string");
    }
}
