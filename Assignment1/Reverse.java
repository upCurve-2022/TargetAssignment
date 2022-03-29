import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        String n=sc.nextLine();
        String rev="";
        for(int i=(n.length()-1);i>=0;i--)
            rev=rev+String.valueOf(n.charAt(i));
        System.out.println("Reverse is:"+rev);
    }
}
