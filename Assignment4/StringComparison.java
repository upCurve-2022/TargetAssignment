import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1");
        String str1 = sc.nextLine();
        System.out.println("Enter the String2");
        String str2 = sc.nextLine();
        System.out.println("Different comparison ways");
        System.out.println("1.equals()   2.equalsIgnoreCase()  3.compareTo()\nselect a choice from menu");
       int ch=sc.nextInt();
       switch(ch)
       {
           case 1:if(str1.equals(str2))
                    System.out.println(str1+" is equal to "+str2);
                  else
                     System.out.println(str1+" is not equal to "+str2);
                  break;
           case 2:if(str1.equalsIgnoreCase(str2))
                    {
                      System.out.println(str1+" is equal to "+str2+" by ignoring cases");
                    }
                    else
                        System.out.println(str1+" is not equal to "+str2);
                    break;
           case 3:int a=str1.compareTo(str2);
                    if(a>0)
                    {
                        System.out.println(str1+" is greater than "+str2);
                    }
                    else if(a<0)
                        System.out.println(str1+" is lesser than "+str2);
                    else
                        System.out.println(str1+" is equal to "+str2);
                    break;
       }

    }


}
