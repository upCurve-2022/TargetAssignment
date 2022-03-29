import java.util.Scanner;

public class RemoveHyphen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.nextLine();
       String str="";
        char[] str2=str1.toCharArray();
         str=str+str2[0];
        for(int i=1;i<str1.length();i++)
        {
            if(str2[i]=='-')
            {
                if ((str2[i - 1] >= '0' && str2[i - 1] <= '9') && (str2[i + 1] >= '0' && str2[i + 1] <= '9'))
                {
                   continue;
                }
                else
                    str=str+str2[i];
            }
            else
            {
                str=str+str2[i];}
        }
        System.out.println(str);
    }
}
