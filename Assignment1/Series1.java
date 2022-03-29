import java.util.Scanner;
public class Series1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n value");
      int n=sc.nextInt();
      int a=4,res;
      for(int i=1;i<=n;i++)
      {
          res=a*(int)Math.pow(i,2);
          System.out.println(res );
      }
    }
}
