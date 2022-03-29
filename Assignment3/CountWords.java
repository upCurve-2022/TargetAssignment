import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int l=str.length();
        int count=1;
        for(int i=0;i<l;i++)
        {
            if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
            {
                count=count+1;
            }
        }
        System.out.println("No of words are:"+count);
    }
}
