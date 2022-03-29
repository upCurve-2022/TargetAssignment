import java.util.Scanner;
public class Contain {
    void isSubString(String s1,String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int flag = 0;
        for (int i = 0; i < n1; i++) {
            int j;
            for (j = 0; j < n2; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == n2) {
                flag = 1;
                System.out.println(s1 + " contains " + s2);
            }
        }
        if (flag == 0) {
            System.out.println(s1 + " does not contains " + s2);
        }
    }
    public static void main(String []args){

        System.out.println("Enter string 1: ");
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        System.out.println("Enter string 2: ");
        String str2=s.nextLine();


    Contain obj=new Contain();
        obj.isSubString(str1,str2);
}
}
